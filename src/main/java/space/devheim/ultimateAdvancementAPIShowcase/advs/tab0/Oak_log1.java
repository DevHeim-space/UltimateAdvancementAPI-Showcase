package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0;

import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Oak_log1 extends BaseAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.SHOWCASE_NAMESPACE, "oak_log1");

    public Oak_log1(Advancement parent, float x, float y) {
        super(KEY.getKey(), new AdvancementDisplay(Material.OAK_LOG, "§f§lPunch Trees", AdvancementFrameType.TASK, true, true, x, y, "§7Break 10 logs.", "", "§6Reward:", "§7A wooden axe."), parent, 10);

        registerEvent(BlockBreakEvent.class, event -> {

            Player player = event.getPlayer();

            if (parent.isGranted(player) && Tag.LOGS.isTagged(event.getBlock().getType())) {
                incrementProgression(player);
            }

        });
    }

    @Override
    public void giveReward(@NotNull Player player) {
        player.getInventory().addItem(new ItemStack(Material.WOODEN_AXE));
    }
}