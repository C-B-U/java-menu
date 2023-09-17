package menu;

public class OutputView {

    public void printErrorMessage(String error){
        System.out.println(error);
    }

    public void printProgressCoachNameMessage(){
        System.out.println(ProgressMessage.INPUT_COACH_NAME);
    }

    public void printProgressCoachForbiddenMessage(String name){
        System.out.printf((ProgressMessage.INPUT_COACH_FORBIDDEN_MENU.getMessage()) + "%n", name);
    }
}
