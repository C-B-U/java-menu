package menu.domain;

import menu.collection.MenuMap;
import menu.constant.ErrorMessage;

public final class CoachMenu {
    private final String name;

    public CoachMenu(final String name) {
        if (!MenuMap.getInstance().contains(name)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_MENU_NAME.toString());
        }
        this.name = name;
    }
}
