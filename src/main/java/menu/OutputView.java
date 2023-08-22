package menu;

public class OutputView {
    public void printStartMessage() {
        System.out.println(ProcessMessage.START_MESSAGE.getMessage());
    }

    public void printRequestCoachNameMessage() {
        System.out.println(ProcessMessage.INPUT_NAME_MESSAGE.getMessage());
    }

    public void printRequestHateFoodMessage(String name) {
        System.out.println(ProcessMessage.NEW_LINE_MESSAGE.getMessage() + name + ProcessMessage.INPUT_CANNOT_EAT_FOOD_MESSAGE.getMessage());
    }

    public void printRecommendMessage() {
        System.out.println(ProcessMessage.NEW_LINE_MESSAGE.getMessage() + ProcessMessage.RECOMMEND_MESSAGE.getMessage());
    }

    public void printFoodMap(String result) {
        System.out.println(ProcessMessage.WEEKDAY_MESSAGE.getMessage());
        System.out.println(result);
    }

    public void printExceptionMessage(IllegalArgumentException exception) {
        System.out.println(exception.getMessage());
    }

    public void printFinishedMessage() {
        System.out.println(ProcessMessage.FINISH_MESSAGE.getMessage());
    }
}
