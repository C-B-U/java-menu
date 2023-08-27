package menu;

public class Controller {
    private final InputView inputView;
    private final OutputView outputView;
    private final RecommendSystem recommendSystem = new RecommendSystem();
    private final CoachInformation coachInformation = new CoachInformation();

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        survey();
        recommend();
    }

    public void survey() {
        outputView.printStartMessage();
        outputView.printRequestCoachNameMessage();
        inputView.readCoachNames().forEach(name -> {
            outputView.printRequestHateFoodMessage(name);
            coachInformation.put(name, inputView.readFoodCannotEat());
        });
    }

    private void recommend() {
        recommendSystem.run(coachInformation.getInformation());
        outputView.printRecommendMessage();
        outputView.printRecommendMenus(recommendSystem.getRecommendMenus());
        outputView.printFinishedMessage();
    }
}
