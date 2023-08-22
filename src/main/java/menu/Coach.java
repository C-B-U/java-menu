package menu;

import java.util.List;

public class Coach {
    private final String name;
    private final List<String> hateFoods;

    public Coach(String name, List<String> hateFoods) {
        this.name = name;
        this.hateFoods = hateFoods;
    }

    public String getName() {
        return name;
    }

    public boolean isHateFood(String recommend) {
        return this.hateFoods.contains(recommend);
    }
}
