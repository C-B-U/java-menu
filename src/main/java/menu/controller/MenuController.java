package menu.controller;

import menu.model.CoachNames;
import menu.model.ForbiddenMenu;
import menu.model.RecommendCategory;
import menu.model.RecommendMenu;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RecommendCategory recommendCategory;
    private final RecommendMenu recommendMenu;

    public MenuController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.recommendCategory = new RecommendCategory();
        this.recommendMenu = new RecommendMenu();
    }

    public void StartRecommend(){
        outputView.printStartMenu();
        CoachNames coachNames = inputView.readCoachName();
        ForbiddenMenu forbiddenMenu = inputView.readForbiddenMenu(coachNames);

        while (recommendCategory.isRecommending()){
            recommendCategory.createRecommendCategory();
            recommendMenu.createRecommendMenu(coachNames, forbiddenMenu, recommendCategory);
        }
        outputView.printRecommendResult(recommendMenu, recommendCategory);
    }
}
