package space.devheim.ultimateAdvancementAPIShowcase.advs.tab0.iron_pickaxe11;

import com.fren_gor.ultimateAdvancementAPI.advancement.tasks.AbstractMultiTasksAdvancement;
import com.fren_gor.ultimateAdvancementAPI.advancement.tasks.TaskAdvancement;
import com.fren_gor.ultimateAdvancementAPI.util.AdvancementKey;
import space.devheim.ultimateAdvancementAPIShowcase.advs.AdvancementTabNamespaces;

public class Iron_hoe extends TaskAdvancement {

    public static AdvancementKey KEY = new AdvancementKey(AdvancementTabNamespaces.tab0_NAMESPACE, "iron_hoe");

    public Iron_hoe(AbstractMultiTasksAdvancement multitask) {
        super(KEY.getKey(), multitask, 1);
    }
}