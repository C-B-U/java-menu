package menu.domain;

import menu.constant.MenuCategory;

import java.util.ArrayList;
import java.util.List;

public class MenuCategories {

    private static final Long MAX_COUNT = 2L;
    private static final Integer DAY_COUNT = 5;
    private final List<MenuCategory> menuCategories;

    public MenuCategories() {
        this.menuCategories = new ArrayList<>();
    }

    public boolean hasMaxNum(final MenuCategory menuCategory) {
        return menuCategories.stream()
                .filter(mc -> mc == menuCategory)
                .count() == MAX_COUNT;
    }

    public boolean needNext() {
        return menuCategories.size() < DAY_COUNT;
    }

    public List<MenuCategory> getMenuCategories() {
        return this.menuCategories;
    }

    public void addMenuCategory(final MenuCategory menuCategory) {
        menuCategories.add(menuCategory);
    }
}
