package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0;

import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.advancement.multiParents.MultiParentsAdvancement;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import org.bukkit.Material;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Iron_ingot7 extends MultiParentsAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.tab0_NAMESPACE, "iron_ingot7");

    public Iron_ingot7(float x, float y, BaseAdvancement... parents) {
        super(KEY.getKey(), new AdvancementDisplay(Material.IRON_INGOT, "§f§lIron ingots", AdvancementFrameType.TASK, false, false, x, y, "§7Smelt iron ores to get 10 iron ingots.", "", "§6Reward:", "§7Unlocks every ore in cobblestone generators."), 1, parents);
    }
}