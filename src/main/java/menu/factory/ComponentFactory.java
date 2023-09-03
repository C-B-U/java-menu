package menu.factory;

import menu.controller.MenuController;

public class ComponentFactory {

    public MenuController menuController() {
        return new MenuController();
    }
}
