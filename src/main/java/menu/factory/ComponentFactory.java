package menu.factory;

import menu.controller.MenuController;
import menu.io.OutputView;

public class ComponentFactory {

    public MenuController menuController() {
        return new MenuController(outputView());
    }

    private OutputView outputView() {
        return new OutputView();
    }
}
