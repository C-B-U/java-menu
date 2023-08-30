package menu;

public class InputValidator {

    public void validateCommaContain(String coachName){
        if (!coachName.contains(",")){
            throw new IllegalArgumentException(ErrorMessage.INPUT_COMMA_ERROR.toString());
        }
    }
}
