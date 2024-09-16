package menu.controller;

import menu.domain.Name;
import menu.service.MenuService;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.List;

public class MenuController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final MenuService menuService = new MenuService();

    public void start() {
        outputView.printStartMessage();
        addCoachAndExcludedFoods();
        menuService.recommendMenus();
        outputView.printResult(menuService.getCategories(), menuService.getCoaches());
    }

    private void addCoachAndExcludedFoods() {
        List<Name> coaches = inputView.readNames();
        coaches.forEach(name -> {
            outputView.printExcludedFood(name);
            menuService.addCoach(name, inputView.readExcludedFood());
            outputView.printNewLine();
        });
    }
}
