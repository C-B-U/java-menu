package menu.domain;

import menu.constant.ErrorMessage;

import java.util.List;
import java.util.stream.Collectors;

public class HateMenus {

    private static final int MAX_HATE_MENU_SIZE = 2;
    private final List<Menu> menus;

    public HateMenus(final List<String> menus) {
        validateSize(menus);
        this.menus = menus.stream().map(Menu::new).collect(Collectors.toList());
    }

    private void validateSize(final List<String> menus) {
        if (menus.size() > MAX_HATE_MENU_SIZE) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_MENU_SIZE.getMessage());
        }
    }
}
