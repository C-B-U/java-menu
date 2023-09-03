package menu.io;

import menu.constant.ProgressMessage;

public class OutputView {

    public void printStart() {
        System.out.println(ProgressMessage.START_MESSAGE);
    }

    public void printCoachNameRequest() {
        System.out.println(ProgressMessage.COACH_NAME_REQUEST);
    }
}
