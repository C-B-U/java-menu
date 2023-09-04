package menu.domain;

import menu.constant.ErrorMessage;

public final class Menu {
    private final String name;

    public Menu(final String name) {
        if (!name.isEmpty() && notContainsName(name)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_MENU_NAME.toString());
        }
        this.name = name;
    }

    private boolean notContainsName(final String name) {
        return !MenuMap.getInstance().contains(name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
