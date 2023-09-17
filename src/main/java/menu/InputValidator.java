package menu;

public class InputValidator {

    public static final String DIVISION = ",";

    public void validateContainComma(String names){
        if (!names.contains(DIVISION)){
            throw new IllegalArgumentException(ErrorMessage.DIVISION_COMMA_ERROR.getMessage());
        }
    }
}
