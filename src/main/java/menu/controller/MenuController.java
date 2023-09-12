package menu.controller;

import menu.domain.Coaches;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();

    public void start() {
        outputView.printStart();
        MenuService menuService = new MenuService(readCoaches());
        menuService.recommend();
        outputView.printRecommendResult(menuService.getCategories(), menuService.getCoaches());
    }

    private Coaches readCoaches() {
        Coaches coaches = readNames();
        readExcludedFood(coaches);
        return coaches;
    }

    private Coaches readNames() {
        outputView.printCoachNames();
        return inputView.readNames();
    }

    private void readExcludedFood(Coaches coaches) {
        coaches.getCoaches()
                .forEach(coach -> {
                    outputView.printExcludedMenu(coach.getName());
                    coach.addExcludedMenu(inputView.readExcludedMenu());
                });
    }
}
