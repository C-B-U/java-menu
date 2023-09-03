package menu.factory;

import menu.controller.MenuController;
import menu.io.InputManager;
import menu.io.InputValidator;
import menu.io.InputView;
import menu.io.OutputView;

public class ComponentFactory {

    public MenuController menuController() {
        return new MenuController(outputView(), inputManager());
    }

    private InputManager inputManager() {
        return new InputManager(inputView());
    }

    private InputView inputView() {
        return new InputView(inputValidator());
    }

    private InputValidator inputValidator() {
        return new InputValidator();
    }

    private OutputView outputView() {
        return new OutputView();
    }
}
