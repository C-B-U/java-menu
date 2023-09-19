package menu.view;

import menu.constants.Days;
import menu.constants.ProgressMessage;

public class OutputView {

    public void printStartMenuRecommend() {
        System.out.println(ProgressMessage.START_MENU_RECOMMEND);
        printEnter();
    }

    public void printErrorMessage(String error) {
        System.out.println(error);
    }

    public void printProgressCoachNameMessage() {
        System.out.println(ProgressMessage.INPUT_COACH_NAME);
    }

    public void printProgressCoachForbiddenMessage(String name) {
        System.out.printf((ProgressMessage.INPUT_COACH_FORBIDDEN_MENU.getMessage()) + "%n", name);
    }

    public void printResultMenu(String result) {
        System.out.println(ProgressMessage.RECOMMEND_MENU_RESULT);
        System.out.println(Days.showDivisionDays());
        System.out.println(result);
        System.out.println(ProgressMessage.FINISH_RECOMMEND);
    }

    public void printEnter() {
        System.out.println();
    }
}
