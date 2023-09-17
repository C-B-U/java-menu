package menu;

public class MenuController {

    private final MenuService menuService;
    private final InputView inputView;
    private final OutputView outputView;

    public MenuController() {
        this.menuService = new MenuService();
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run(){
        outputView.printStartMenuRecommend();
        Coaches coaches = inputView.inputCoachName();
        addCoachesForbiddenMenu(coaches);
    }

    private void addCoachesForbiddenMenu(Coaches coaches) {
        for (Coach coach : coaches.getCoaches()){
            String menu = inputView.inputForbiddenMenus(coach);
            coach.addForbiddenMenu(menu);
        }
    }
}
