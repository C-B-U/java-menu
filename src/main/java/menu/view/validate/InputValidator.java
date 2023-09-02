package menu.view.validate;

import menu.constant.ErrorMessage;

import java.util.Arrays;

public class InputValidator {

    private static final String DIVISION = ",";
    private static final int MAX_FORBIDDEN_MENU_COUNT = 2;

    public void validateCommaContain(String coachName){
        if (!coachName.contains(DIVISION)){
            throw new IllegalArgumentException(ErrorMessage.INPUT_COMMA_ERROR.toString());
        }
    }

    public void validateForbiddenMenuCount(String forbiddenMenu){
         long forbiddenMenuCount = Arrays.stream(forbiddenMenu.split(",")).count();
         if(forbiddenMenuCount > MAX_FORBIDDEN_MENU_COUNT){
             throw new IllegalArgumentException(ErrorMessage.INPUT_COMMA_ERROR.toString());
         }
    }
}
