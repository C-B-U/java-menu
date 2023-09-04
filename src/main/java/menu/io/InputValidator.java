package menu.io;

import menu.constant.ErrorMessage;

public class InputValidator {
    private static final String DELIMETER = ",";

    public void validateCoachMenu(final String input) {
        if (input.isEmpty()) {
            return;
        }
        validateSplitter(input);
    }

    public void validateSplitter(final String input) {
        if (invalidSplitterUsage(input)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_DELIMITER_USAGE.toString());
        }
    }

    private boolean invalidSplitterUsage(final String input) {
        return input.startsWith(DELIMETER) || input.endsWith(DELIMETER);
    }
}
