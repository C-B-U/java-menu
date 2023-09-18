package menu.controller;

import menu.domain.Coaches;
import menu.io.InputManager;
import menu.io.OutputView;
import menu.service.MenuService;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputManager inputManager = new InputManager();
    private final MenuService menuService = new MenuService();

    public void run() {
        outputView.printStart();
        createCoach();
    }

    private void createCoach() {
        outputView.printCoachNameRequest();
        final Coaches coaches = inputManager.readCoachNames();
        menuService.saveCoaches(coaches);
    }
}
