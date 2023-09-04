package menu.io;

import menu.constant.ProgressMessage;
import menu.domain.Coach;
import menu.domain.RecommendResult;

public class OutputView {

    public void printStart() {
        System.out.println(ProgressMessage.START_MESSAGE);
    }

    public void printCoachNameRequest() {
        System.out.println(ProgressMessage.COACH_NAME_REQUEST);
    }

    public void printCoachMenuRequest(final Coach coach) {
        System.out.println(String.format(ProgressMessage.COACH_MENU_REQUEST.toString(), coach.getName()));
    }

    public void printRecommendResult(final RecommendResult recommendResult) {
        System.out.println(ProgressMessage.RECOMMEND_RESULT);
        System.out.println(ProgressMessage.DAY_CLASSIFIER);
        System.out.println(recommendResult);
        System.out.println(ProgressMessage.RECOMMEND_FINISH);
    }
}
