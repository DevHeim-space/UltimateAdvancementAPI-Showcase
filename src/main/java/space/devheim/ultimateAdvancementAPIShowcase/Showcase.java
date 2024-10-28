package space.devheim.ultimateAdvancementAPIShowcase;

import com.fren_gor.ultimateAdvancementAPI.AdvancementTab;
import com.fren_gor.ultimateAdvancementAPI.UltimateAdvancementAPI;
import com.fren_gor.ultimateAdvancementAPI.advancement.BaseAdvancement;
import com.fren_gor.ultimateAdvancementAPI.util.CoordAdapter;
import org.bukkit.plugin.java.JavaPlugin;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;
import space.devheim.ultimateAdvancementAPIShowcase.advs.tab0.*;
import space.devheim.ultimateAdvancementAPIShowcase.advs.tab0.iron_pickaxe11.*;

import java.util.HashSet;

public class Showcase extends JavaPlugin {

    public static UltimateAdvancementAPI api;

    public AdvancementTab tab0;

    @Override
    public void onEnable() {
        api = UltimateAdvancementAPI.getInstance(this);
        initializeTabs();
    }

    public void initializeTabs() {
        tab0 = api.createAdvancementTab(AdvancementTabNamespaces.SHOWCASE_NAMESPACE);
        HashSet<BaseAdvancement> tab0Set = new HashSet<>();

        CoordAdapter adaptertab0 = CoordAdapter.builder().add(Grass_block0.KEY, 0f, 0f).add(Oak_log1.KEY, 1f, 0f).add(Cobblestone2.KEY, 3f, 0f).add(Stone_pickaxe3.KEY, 4f, -1f).add(Furnace4.KEY, 4f, 1f).add(Iron_ore5.KEY, 5f, -1f).add(Charcoal6.KEY, 5f, 1f).add(Iron_ingot7.KEY, 6f, 0f).add(Wooden_pickaxe10.KEY, 2f, 0f).add(Iron_pickaxe11.KEY, 7f, 0f).build();

        Grass_block0 grass_block0 = new Grass_block0(tab0, adaptertab0.getX(Grass_block0.KEY), adaptertab0.getY(Grass_block0.KEY));
        Oak_log1 oak_log1 = new Oak_log1(grass_block0, adaptertab0.getX(Oak_log1.KEY), adaptertab0.getY(Oak_log1.KEY));
        Wooden_pickaxe10 wooden_pickaxe10 = new Wooden_pickaxe10(oak_log1, adaptertab0.getX(Wooden_pickaxe10.KEY), adaptertab0.getY(Wooden_pickaxe10.KEY));
        Cobblestone2 cobblestone2 = new Cobblestone2(wooden_pickaxe10, adaptertab0.getX(Cobblestone2.KEY), adaptertab0.getY(Cobblestone2.KEY));
        Stone_pickaxe3 stone_pickaxe3 = new Stone_pickaxe3(cobblestone2, adaptertab0.getX(Stone_pickaxe3.KEY), adaptertab0.getY(Stone_pickaxe3.KEY));
        Furnace4 furnace4 = new Furnace4(cobblestone2, adaptertab0.getX(Furnace4.KEY), adaptertab0.getY(Furnace4.KEY));
        Iron_ore5 iron_ore5 = new Iron_ore5(stone_pickaxe3, adaptertab0.getX(Iron_ore5.KEY), adaptertab0.getY(Iron_ore5.KEY));
        Charcoal6 charcoal6 = new Charcoal6(furnace4, adaptertab0.getX(Charcoal6.KEY), adaptertab0.getY(Charcoal6.KEY));
        Iron_ingot7 iron_ingot7 = new Iron_ingot7(adaptertab0.getX(Iron_ingot7.KEY), adaptertab0.getY(Iron_ingot7.KEY), iron_ore5, charcoal6);
        Iron_pickaxe11 iron_pickaxe11 = new Iron_pickaxe11(iron_ingot7, adaptertab0.getX(Iron_pickaxe11.KEY), adaptertab0.getY(Iron_pickaxe11.KEY));
        Iron_sword iron_sword = new Iron_sword(iron_pickaxe11);
        Iron_pickaxe iron_pickaxe = new Iron_pickaxe(iron_pickaxe11);
        Iron_axe iron_axe = new Iron_axe(iron_pickaxe11);
        Iron_shovel iron_shovel = new Iron_shovel(iron_pickaxe11);
        Iron_hoe iron_hoe = new Iron_hoe(iron_pickaxe11);
        iron_pickaxe11.registerTasks(iron_sword, iron_pickaxe, iron_axe, iron_shovel, iron_hoe);

        tab0Set.add(oak_log1);
        tab0Set.add(cobblestone2);
        tab0Set.add(stone_pickaxe3);
        tab0Set.add(furnace4);
        tab0Set.add(iron_ore5);
        tab0Set.add(charcoal6);
        tab0Set.add(iron_ingot7);
        tab0Set.add(wooden_pickaxe10);
        tab0Set.add(iron_pickaxe11);

        tab0.registerAdvancements(grass_block0, tab0Set);
        tab0.automaticallyGrantRootAdvancement();
        tab0.automaticallyShowToPlayers();
    }
}
