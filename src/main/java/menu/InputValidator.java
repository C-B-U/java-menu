package menu;

import java.util.Arrays;

public class InputValidator {

    public void validateCommaContain(String coachName){
        if (!coachName.contains(",")){
            throw new IllegalArgumentException(ErrorMessage.INPUT_COMMA_ERROR.toString());
        }
    }

    public void validateForbiddenMenuCount(String forbiddenMenu){
         long forbiddenMenuCount = Arrays.stream(forbiddenMenu.split(",")).count();
         if(forbiddenMenuCount > 2){
             throw new IllegalArgumentException(ErrorMessage.INPUT_COMMA_ERROR.toString());
         }
    }
}
