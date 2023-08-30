package menu;

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
        CoachNames coachNames = inputView.inputCoachName();
        ForbiddenMenu forbiddenMenu = inputView.inputForbiddenMenu(coachNames);
        recommendCategory.createRecommendCategory();
        recommendMenu.createRecommendMenu(coachNames, forbiddenMenu, recommendCategory);
        outputView.printRecommendResult(recommendMenu);
    }
}
