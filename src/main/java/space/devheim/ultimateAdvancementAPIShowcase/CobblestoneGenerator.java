package space.devheim.ultimateAdvancementAPIShowcase;

import com.fren_gor.ultimateAdvancementAPI.AdvancementTab;
import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;
import org.jetbrains.annotations.NotNull;
import space.devheim.ultimateAdvancementAPIShowcase.advs.tab0.Charcoal6;
import space.devheim.ultimateAdvancementAPIShowcase.advs.tab0.Iron_ingot7;
import space.devheim.ultimateAdvancementAPIShowcase.advs.tab0.Stone_pickaxe3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class CobblestoneGenerator implements Listener {

    private static final Material[] EVERY_ORE = {
            Material.COAL_ORE,
            Material.COPPER_ORE,
            Material.IRON_ORE,
            Material.GOLD_ORE,
            Material.DIAMOND_ORE,
            Material.EMERALD_ORE,
            Material.LAPIS_ORE,
            Material.REDSTONE_ORE
    };

    private final Advancement stonePickaxeAdv, charcoalAdv, ironIngotAdv;

    public CobblestoneGenerator(@NotNull AdvancementTab tab) {
        this.stonePickaxeAdv = tab.getAdvancement(Stone_pickaxe3.KEY);
        this.charcoalAdv = tab.getAdvancement(Charcoal6.KEY);
        this.ironIngotAdv = tab.getAdvancement(Iron_ingot7.KEY);

        tab.registerEvent(BlockFormEvent.class, this::onBlockFormEvent);
    }

    private void onBlockFormEvent(@NotNull BlockFormEvent e) {
        BlockState newState = e.getNewState();
        if (newState.getType() != Material.COBBLESTONE && newState.getType() != Material.STONE) {
            return;
        }

        Block b = e.getBlock();
        Location l = b.getLocation();

        // Since we don't have real skyblock islands in this showcase, just use the nearest player to the generated block
        Optional<Player> nearest = b.getWorld().getPlayers()
                .stream()
                .min(Comparator.comparingDouble(p -> p.getLocation().distanceSquared(l)));

        if (nearest.isEmpty()) {
            return;
        }

        // Generate a custom block
        e.setCancelled(true);

        // Stone pickaxe -> Iron ore
        // Charcoal -> Coal ore
        // Iron ingot -> Every ore

        if (ironIngotAdv.isGranted(nearest.get())) {
            generateOre(EVERY_ORE, b);
            return;
        }

        List<Material> possibilities = new ArrayList<>();
        if (stonePickaxeAdv.isGranted(nearest.get())) {
            possibilities.add(Material.IRON_ORE);
        }
        if (charcoalAdv.isGranted(nearest.get())) {
            possibilities.add(Material.COAL_ORE);
        }

        generateOre(possibilities.toArray(new Material[0]), b);
    }

    private void generateOre(@NotNull Material[] possibilities, @NotNull Block block) {
        if (possibilities.length == 0) {
            block.setType(Material.COBBLESTONE);
            return;
        }

        // Generate cobblestone with 50% probability, otherwise generate an ore with a uniform distribution
        ThreadLocalRandom random = ThreadLocalRandom.current();
        if (random.nextInt(0, 100) < 50) {
            block.setType(Material.COBBLESTONE);
        } else if (possibilities.length == 1) { // Small optimization
            block.setType(possibilities[0]);
        } else {
            block.setType(possibilities[random.nextInt(0, possibilities.length)]);
        }
    }
}
