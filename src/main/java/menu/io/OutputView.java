package menu.io;

import menu.constant.GameMessage;

public class OutputView {

    public void printStart() {
        System.out.println(GameMessage.START.getMessage());
    }

    public void printCoachNameRequest() {
        System.out.println(GameMessage.COACH_NAME_REQUEST.getMessage());
    }
}
