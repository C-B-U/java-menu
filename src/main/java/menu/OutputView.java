package menu;

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

    public void printRecommendResult(RecommendMenu recommendMenu) {
        System.out.println(ProcessMessage.OUTPUT_RESULT_MENU);
        System.out.println(Days.outputDays());
        System.out.println(Categories.outputCategories());
        System.out.println(recommendMenu);
        System.out.println(ProcessMessage.OUTPUT_FINISH_MENU);
    }
}
