package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0;

import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Wooden_pickaxe10 extends BaseAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.SHOWCASE_NAMESPACE, "wooden_pickaxe10");

    public Wooden_pickaxe10(Advancement parent, float x, float y) {
        super(KEY.getKey(), new AdvancementDisplay(Material.WOODEN_PICKAXE, "§f§lWooden pickaxe", AdvancementFrameType.TASK, true, true, x, y, "§7Craft a wooden pickaxe.", "", "§6Reward:", "§7A wooden sword."), parent, 1);

        registerEvent(CraftItemEvent.class, event -> {

            Player player = (Player) event.getWhoClicked();

            if (parent.isGranted(player) && event.getRecipe().getResult().getType() == Material.WOODEN_PICKAXE) {
                incrementProgression(player);
            }

        });
    }

    @Override
    public void onGrant(@NotNull Player player, boolean giveRewards) {
        player.getInventory().addItem(new ItemStack(Material.WOODEN_SWORD, 5));
    }
}