package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0;

import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.FurnaceInventory;
import org.bukkit.inventory.ItemStack;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Charcoal6 extends BaseAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.SHOWCASE_NAMESPACE, "charcoal6");

    public Charcoal6(Advancement parent, float x, float y) {
        super(KEY.getKey(), new AdvancementDisplay(Material.CHARCOAL, "§f§lCharcoal", AdvancementFrameType.TASK, true, true, x, y, "§7Smelt logs to get 10 charcoal.", "", "§6Reward:", "§7Unlocks coal ores in cobblestone generators."), parent, 10);

        registerEvent(InventoryClickEvent.class, event -> {

            Player player = (Player) event.getWhoClicked();
            var inv = event.getInventory();

            if (parent.isGranted(player) && inv instanceof FurnaceInventory && event.getSlotType() == InventoryType.SlotType.RESULT) {

                ItemStack itemStack = event.getCurrentItem();

                if (itemStack != null && itemStack.getType() == Material.CHARCOAL) {
                    incrementProgression(player, itemStack.getAmount());
                }

            }

        });
    }
}