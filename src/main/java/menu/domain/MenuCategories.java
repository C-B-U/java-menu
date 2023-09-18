package menu.domain;

import menu.constant.MenuCategory;

import java.util.ArrayList;
import java.util.List;

public class MenuCategories {

    private static final Long MAX_COUNT = 2L;
    private static final Integer DAY_COUNT = 5;
    private final List<MenuCategory> menuCategories = new ArrayList<>();

    public boolean hasMaxNum(final MenuCategory menuCategory) {
        return menuCategories.stream()
                .filter(menuCategory::equals)
                .count() == MAX_COUNT;
    }

    public void addRecommendedMenu(final Coach coach, final String menus, final MenuCategory menuCategory) {
        if (!menuCategories.contains(menuCategory)) {
            menuCategories.add(menuCategory);
        }
        coach.updateRecommendedMenus(menus);
    }

    public boolean needNext() {
        return menuCategories.size() < DAY_COUNT;
    }
}
