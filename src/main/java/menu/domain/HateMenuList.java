package menu.domain;

import menu.constant.ErrorMessage;

import java.util.List;
import java.util.stream.Collectors;

public class HateMenuList {
    private static final int MAX_SIZE = 2;
    private final List<Menu> menus;

    public HateMenuList(final List<String> menus) {
        validateSize(menus);
        this.menus = menus.stream().map(Menu::new).collect(Collectors.toList());
    }

    private void validateSize(final List<String> menus) {
        if (menus.size() > MAX_SIZE) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_HATE_MENU_NUM.toString());
        }
    }

    public List<Menu> getMenus() {
        return this.menus;
    }
}
