package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0;

import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import org.bukkit.Material;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Stone_pickaxe3 extends BaseAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.SHOWCASE_NAMESPACE, "stone_pickaxe3");

    public Stone_pickaxe3(Advancement parent, float x, float y) {
        super(KEY.getKey(), new AdvancementDisplay(Material.STONE_PICKAXE, "§f§lStone pickaxe", AdvancementFrameType.TASK, false, false, x, y, "§7Craft a stone pickaxe.", "", "§6Reward:", "§7Unlocks iron ores in cobblestone generators."), parent, 1);
    }
}