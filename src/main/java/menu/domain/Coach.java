package menu.domain;

import menu.constant.ErrorMessage;

public class Coach {
    private static final int MIN_NAME_LENGTH = 2;
    private static final int MAX_NAME_LENGTH = 4;
    private final String name;

    public Coach(final String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(final String name) {
        final int length = name.length();
        if (invalidLength(length)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_COACH_NAME_LENGTH.toString());
        }
    }

    private boolean invalidLength(final int length) {
        return length < MIN_NAME_LENGTH || length > MAX_NAME_LENGTH;
    }
}
