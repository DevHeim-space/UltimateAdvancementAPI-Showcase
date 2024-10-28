package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0;

import com.fren_gor.ultimateAdvancementAPI.AdvancementTab;
import com.fren_gor.ultimateAdvancementAPI.advancement.RootAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementDisplay;
import com.fren_gor.ultimateAdvancementAPI.advancement.display.AdvancementFrameType;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import org.bukkit.Material;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Grass_block0 extends RootAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.SHOWCASE_NAMESPACE, "grass_block0");

    public Grass_block0(AdvancementTab tab, float x, float y) {
        super(tab, KEY.getKey(), new AdvancementDisplay(Material.GRASS_BLOCK, "§a§lWelcome to SkyBlock!", AdvancementFrameType.TASK, false, false, x, y, "§7These are your first advancements in your adventure."), "textures/block/stone.png", 1);
    }
}