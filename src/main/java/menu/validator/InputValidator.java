package menu.validator;

import menu.constant.ExceptionMessage;

import java.util.regex.Pattern;

public class InputValidator {

    private static final String DELIMITER_REGEXP = "^[a-zA-Zㄱ-힣0-9,]*$";

    public void validateDelimiter(String input) {
        if (!Pattern.matches(DELIMITER_REGEXP, input)) {
            ExceptionMessage exceptionMessage = ExceptionMessage.INCORRECT_DELIMITER;
            throw new IllegalArgumentException(exceptionMessage.toString());
        }
    }
}
