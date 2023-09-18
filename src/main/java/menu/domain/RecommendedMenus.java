package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class RecommendedMenus {
    private final List<Menu> recommendedMenus;

    public RecommendedMenus() {
        this.recommendedMenus = new ArrayList<>();
    }

    public void addMenu(final String menuName) {
        recommendedMenus.add(new Menu(menuName));
    }
}
