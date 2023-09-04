package menu.domain;

import java.util.List;
import java.util.stream.Collectors;

public class HateMenuList {
    private static final int MIN_SIZE = 2;
    private final List<Menu> menus;

    public HateMenuList(final List<String> menus) {
        validateSize(menus);
        this.menus = menus.stream().map(Menu::new).collect(Collectors.toList());
    }

    private void validateSize(final List<String> menus) {
        if (menus.size() > MIN_SIZE) {
            throw new IllegalArgumentException();
        }
    }

    public List<Menu> getMenus() {
        return this.menus;
    }
}
