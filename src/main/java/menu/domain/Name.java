package menu.domain;

import menu.constant.ExceptionMessage;

public class Name {

    private static final int MIN_LENGTH = 2;
    private static final int MAX_LENGTH = 4;

    private final String value;

    public Name(String value) {
        validateLength(value);
        this.value = value;
    }

    public void validateLength(String value) {
        if (!(MIN_LENGTH <= value.length() && value.length() <= MAX_LENGTH)) {
            throw new IllegalArgumentException(ExceptionMessage.INCORRECT_NAME_RANGE.toString());
        }
    }

    public String getValue() {
        return value;
    }
}
