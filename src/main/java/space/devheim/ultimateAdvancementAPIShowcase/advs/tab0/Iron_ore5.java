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

public class Iron_ore5 extends BaseAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.SHOWCASE_NAMESPACE, "iron_ore5");

    public Iron_ore5(Advancement parent, float x, float y) {
        super(KEY.getKey(), new AdvancementDisplay(Material.IRON_ORE, "§f§lIron ores", AdvancementFrameType.TASK, true, true, x, y, "§7Mine 10 iron ores", "", "§6Reward:", "§75 iron ores."), parent, 10);

        registerEvent(BlockBreakEvent.class, event -> {

            Player player = event.getPlayer();

            if (parent.isGranted(player) && event.getBlock().getType() == Material.IRON_ORE) {
                incrementProgression(player);
            }

        });
    }

    @Override
    public void giveReward(@NotNull Player player) {
        player.getInventory().addItem(new ItemStack(Material.IRON_ORE, 5));
    }
}