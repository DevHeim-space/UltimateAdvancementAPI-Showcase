package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0;

import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import org.bukkit.Material;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Cobblestone2 extends BaseAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.tab0_NAMESPACE, "cobblestone2");

    public Cobblestone2(Advancement parent, float x, float y) {
        super(KEY.getKey(), new AdvancementDisplay(Material.COBBLESTONE, "§f§lCobblestone", AdvancementFrameType.TASK, false, false, x, y, "§7Create a cobblestone generator and mine 20 blocks of cobblestone.", "", "§6Reward:", "§7A chest."), parent, 20);
    }
}