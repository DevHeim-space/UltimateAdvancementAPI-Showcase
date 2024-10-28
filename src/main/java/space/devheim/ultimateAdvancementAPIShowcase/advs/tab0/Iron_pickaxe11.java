package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0;

import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.advancement.tasks.MultiTasksAdvancement;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import org.bukkit.Material;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Iron_pickaxe11 extends MultiTasksAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.SHOWCASE_NAMESPACE, "iron_pickaxe11");

    public Iron_pickaxe11(Advancement parent, float x, float y) {
        super(KEY.getKey(), new AdvancementDisplay(Material.IRON_PICKAXE, "§f§lIron tools!", AdvancementFrameType.CHALLENGE, false, false, x, y, "§7Craft all the iron tools", "§7(Sword, Pickaxe, Axe, Shovel, Hoe).", "", "§6Reward:", "§7Unlocks next advancement tabs! (Unimplemented in the showcase)"), parent, 5);
    }
}