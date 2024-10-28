package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0.iron_pickaxe11;

import com.fren_gor.ultimateAdvancementAPI.advancement.tasks.AbstractMultiTasksAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.tasks.TaskAdvancement;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Iron_shovel extends TaskAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.tab0_NAMESPACE, "iron_shovel");

    public Iron_shovel(AbstractMultiTasksAdvancement multitask) {
        super(KEY.getKey(), multitask, 1);
    }
}