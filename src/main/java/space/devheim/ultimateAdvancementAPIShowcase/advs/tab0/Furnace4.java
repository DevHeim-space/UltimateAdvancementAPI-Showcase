package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0;

import com.fren_gor.ultimateAdvancementAPI.advancement.Advancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import org.bukkit.Material;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Furnace4 extends BaseAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.SHOWCASE_NAMESPACE, "furnace4");

    public Furnace4(Advancement parent, float x, float y) {
        super(KEY.getKey(), new AdvancementDisplay(Material.FURNACE, "§f§lFurnace      §f", AdvancementFrameType.TASK, false, false, x, y, "§7Craft a Furnace.", "", "§6Reward:", "§7A blast furnace."), parent, 1);
    }
}