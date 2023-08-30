package menu.view;

import menu.model.RecommendCategory;
import menu.model.RecommendMenu;
import menu.constant.Days;
import menu.constant.ProcessMessage;

public class OutputView {

    public void printCoachNameMessage(){
        System.out.println(ProcessMessage.INPUT_COACH_NAME);
    }

    public void printErrorMessage(String error){
        System.out.println(error);
    }

    public void printCoachesForbiddenMenu(String name) {
        System.out.println(String.format(ProcessMessage.INPUT_FORBIDDEN_MENU.toString(), name));
    }

    public void printStartMenu() {
        System.out.println(ProcessMessage.OUTPUT_START_MENU);
        printEnter();
    }

    public void printEnter(){
        System.out.println();
    }

    public void printRecommendResult(RecommendMenu recommendMenu, RecommendCategory recommendCategory) {
        System.out.println(ProcessMessage.OUTPUT_RESULT_MENU);
        System.out.println(Days.outputDays());
        System.out.println(recommendCategory);
        System.out.println(recommendMenu);
        System.out.println(ProcessMessage.OUTPUT_FINISH_MENU);
    }
}
