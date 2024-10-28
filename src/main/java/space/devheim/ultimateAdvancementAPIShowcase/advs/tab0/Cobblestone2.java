package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0;

import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Cobblestone2 extends BaseAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.SHOWCASE_NAMESPACE, "cobblestone2");

    public Cobblestone2(Advancement parent, float x, float y) {
        super(KEY.getKey(), new AdvancementDisplay(Material.COBBLESTONE, "§f§lCobblestone", AdvancementFrameType.TASK, true, true, x, y, "§7Create a cobblestone generator and mine 20 blocks of cobblestone.", "", "§6Reward:", "§7A chest."), parent, 20);

        registerEvent(BlockBreakEvent.class, event -> {

            Player player = event.getPlayer();

            if (parent.isGranted(player) && event.getBlock().getType() == Material.COBBLESTONE) {
                incrementProgression(player);
            }

        });
    }

    @Override
    public void onGrant(@NotNull Player player, boolean giveRewards) {
        player.getInventory().addItem(new ItemStack(Material.CHEST));
    }
}