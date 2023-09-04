package menu.controller;

import menu.domain.CoachList;
import menu.domain.RecommendResult;
import menu.io.InputManager;
import menu.io.OutputView;
import menu.service.MenuService;

public class MenuController {
    private final OutputView outputView;
    private final InputManager inputManager;
    private final MenuService menuService;

    public MenuController(final OutputView outputView, final InputManager inputManager, final MenuService menuService) {
        this.outputView = outputView;
        this.inputManager = inputManager;
        this.menuService = menuService;
    }

    public void start() {
        outputView.printStart();
        final CoachList coachList = createCoachList();
        createCoachMenuMap(coachList);
        recommendMenu();
    }

    private void recommendMenu() {
        final RecommendResult recommendResult = menuService.recommendMenu();
        outputView.printRecommendResult(recommendResult);
    }

    private void createCoachMenuMap(final CoachList coachList) {
        coachList.getAllCoaches().forEach(coach -> {
            outputView.printCoachMenuRequest(coach);
            menuService.addHateMenus(coach, inputManager.readCoachMenu());
        });
    }

    private CoachList createCoachList() {
        outputView.printCoachNameRequest();
        final CoachList coachList = inputManager.readCoach();
        return menuService.saveCoachList(coachList);
    }
}
