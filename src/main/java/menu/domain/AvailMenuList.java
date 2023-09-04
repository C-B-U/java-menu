package menu.domain;

import menu.constant.Category;

import java.util.List;
import java.util.Map;

public class AvailMenuList {
    private final Map<Category, List<Menu>> coachAvailMenu;

    public AvailMenuList(final Map<Category, List<Menu>> coachAvailMenu) {
        this.coachAvailMenu = coachAvailMenu;
    }

    public List<Menu> getMenuByCategory(final Category category) {
        return this.coachAvailMenu.get(category);
    }
}
