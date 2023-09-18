package menu.io;

import menu.constant.ErrorMessage;

public class InputValidator {

    private static final String INPUT_DELIMITER = ",";

    public void validateHateMenus(final String input) {
        if (input.isEmpty()) {
            return;
        }
        validateInputDelimiter(input);
    }

    public void validateInputDelimiter(final String input) {
        if (input.startsWith(INPUT_DELIMITER) || input.endsWith(INPUT_DELIMITER)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INPUT_DELIMITER_USAGE.getMessage());
        }
    }
}
