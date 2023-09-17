package menu.controller;

import menu.domain.Coaches;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final MenuService menuService;
    private final InputView inputView;
    private final OutputView outputView;

    public MenuController() {
        this.menuService = new MenuService();
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        outputView.printStartMenuRecommend();
        Coaches coaches = inputView.inputCoachName();
        addCoachesForbiddenMenu(coaches);

        recommendMenu(coaches);
        outputView.printResultMenu(menuService.showMenuResult());
    }

    private void addCoachesForbiddenMenu(Coaches coaches) {
        coaches.getCoaches().forEach(coach -> {
            String menu = inputView.inputForbiddenMenus(coach);
            coach.addForbiddenMenu(menu);
        });
    }

    private void recommendMenu(Coaches coaches) {
        while (menuService.isRecommending()) {
            menuService.addRecommendMenu(coaches);
        }
    }
}
