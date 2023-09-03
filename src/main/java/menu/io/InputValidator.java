package menu.io;

import menu.constant.ErrorMessage;

public class InputValidator {
    private static final String SPLITTER = ",";

    public void validateCoachMenu(final String input) {
        if (input.isEmpty()) {
            return;
        }
        validateSplitter(input);
    }

    public void validateSplitter(final String input) {
        if (invalidSplitterUsage(input)) {
            throw new IllegalArgumentException(ErrorMessage.COACH_NAME_INPUT_ERROR.toString());
        }
    }

    private boolean invalidSplitterUsage(final String input) {
        return !input.contains(SPLITTER) || input.startsWith(SPLITTER) || input.endsWith(SPLITTER);
    }
}
