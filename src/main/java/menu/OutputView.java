package menu;

public class OutputView {

    public void printCoachNameMessage(){
        System.out.println(ProcessMessage.InputCoachName);
    }

    public void printErrorMessage(String error){
        System.out.println(error);
    }
}
