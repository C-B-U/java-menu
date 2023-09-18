package menu.domain;

import menu.constant.ErrorMessage;
import menu.constant.MenuCategory;

public class Menu {
    private final String name;

    public Menu(final String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(final String name) {
        if (MenuCategory.isNotExistMenu(name)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_MENU_NAME.getMessage());
        }
    }
}
