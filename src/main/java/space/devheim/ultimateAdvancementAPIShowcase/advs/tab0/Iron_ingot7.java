package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0;

import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.advancement.multiParents.MultiParentsAdvancement;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.FurnaceInventory;
import org.bukkit.inventory.ItemStack;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Iron_ingot7 extends MultiParentsAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.SHOWCASE_NAMESPACE, "iron_ingot7");

    public Iron_ingot7(float x, float y, BaseAdvancement... parents) {
        super(KEY.getKey(), new AdvancementDisplay(Material.IRON_INGOT, "§f§lIron ingots", AdvancementFrameType.TASK, true, true, x, y, "§7Smelt iron ores to get 10 iron ingots.", "", "§6Reward:", "§7Unlocks every ore in cobblestone generators."), 10, parents);

        registerEvent(InventoryClickEvent.class, event -> {

            Player player = (Player) event.getWhoClicked();
            var inv = event.getInventory();

            if (super.isEveryParentGranted(player) && inv instanceof FurnaceInventory && event.getSlotType() == InventoryType.SlotType.RESULT) {

                ItemStack itemStack = event.getCurrentItem();
                if (itemStack != null && itemStack.getType() == Material.IRON_INGOT) {
                    incrementProgression(player, itemStack.getAmount());
                }

            }

        });
    }
}