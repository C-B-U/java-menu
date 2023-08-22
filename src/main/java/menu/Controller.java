package menu;

public class Controller {
    private final InputView inputView;
    private final OutputView outputView;
    private final Recommender recommender = new Recommender();
    private final CoachInformation coachInformation = new CoachInformation();

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void survey() {
        outputView.printStartMessage();
        outputView.printRequestCoachNameMessage();
        inputView.readCoachNames().forEach(name -> {
            outputView.printRequestHateFoodMessage(name);
            coachInformation.put(name, inputView.readHateFood());
        });
        recommend();
    }

    private void recommend() {
        String result = recommender.run(coachInformation.getInformation());
        outputView.printRecommendMessage();
        outputView.printFoodMap(result);
        outputView.printFinishedMessage();
    }
}
