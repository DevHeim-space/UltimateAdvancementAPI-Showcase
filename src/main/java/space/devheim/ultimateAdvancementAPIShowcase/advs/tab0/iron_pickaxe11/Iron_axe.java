package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0.iron_pickaxe11;

import com.fren_gor.ultimateAdvancementAPI.advancement.tasks.AbstractMultiTasksAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.tasks.TaskAdvancement;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.CraftItemEvent;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Iron_axe extends TaskAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.SHOWCASE_NAMESPACE, "iron_axe");

    public Iron_axe(AbstractMultiTasksAdvancement multitask) {
        super(KEY.getKey(), multitask, 1);

        registerEvent(CraftItemEvent.class, event -> {

            Player player = (Player) event.getWhoClicked();

            if (multitask.getParent().isGranted(player) && event.getRecipe().getResult().getType() == Material.IRON_AXE) {
                incrementProgression(player);
            }

        });
    }
}