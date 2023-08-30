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
}
