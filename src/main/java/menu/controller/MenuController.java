package menu.controller;

import menu.domain.Coaches;
import menu.domain.HateMenus;
import menu.io.InputManager;
import menu.io.OutputView;
import menu.service.MenuService;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputManager inputManager = new InputManager();
    private final MenuService menuService = new MenuService();

    public void run() {
        outputView.printStart();
        final Coaches coaches = createCoach();
        createHateMenu(coaches);
    }

    private void createHateMenu(final Coaches coaches) {
        while (coaches.hasNext()) {
            final String coachName = coaches.getNextCoachName();
            outputView.printCoachHateMenuRequest(coachName);
            final HateMenus hateMenus = inputManager.readCoachHateMenu();
            menuService.updateHateMenus(coachName, hateMenus);
        }
    }

    private Coaches createCoach() {
        outputView.printCoachNameRequest();
        final Coaches coaches = inputManager.readCoachNames();
        return menuService.saveCoaches(coaches);
    }
}
