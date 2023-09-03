package menu.io;

import menu.constant.ProgressMessage;
import menu.domain.Coach;

public class OutputView {

    public void printStart() {
        System.out.println(ProgressMessage.START_MESSAGE);
    }

    public void printCoachNameRequest() {
        System.out.println(ProgressMessage.COACH_NAME_REQUEST);
    }

    public void printCoachMenuRequest(final Coach coach) {
        System.out.println(String.format(ProgressMessage.COACH_MENU_REQUEST.toString(), coach));
    }
}
