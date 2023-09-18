package menu.io;

import menu.constant.GameMessage;
import menu.domain.RecommendResult;

public class OutputView {

    public void printStart() {
        System.out.println(GameMessage.START.getMessage());
    }

    public void printCoachNameRequest() {
        System.out.println(GameMessage.COACH_NAME_REQUEST.getMessage());
    }

    public void printCoachHateMenuRequest(final String coachName) {
        System.out.println(String.format(GameMessage.COACH_HATE_MENU_REQUEST.getMessage(), coachName));
    }

    public void printRecommendResult(final RecommendResult recommendResult) {
        System.out.println(GameMessage.MENU_RECOMMEND_RESULT.getMessage());
        System.out.println(GameMessage.RECOMMEND_DAYS.getMessage());
        System.out.println(recommendResult.getResult());
        System.out.println(GameMessage.RECOMMEND_FINISH.getMessage());
    }
}
