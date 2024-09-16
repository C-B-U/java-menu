package menu.domain;

import menu.constant.ExceptionMessage;

public class Name {

    private static final int MIN_NAME_LENGTH = 2;
    private static final int MAX_NAME_LENGTH = 4;

    private final String name;

    public Name(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (!(MIN_NAME_LENGTH <= name.length() && name.length() <= MAX_NAME_LENGTH)) {
            ExceptionMessage exceptionMessage = ExceptionMessage.INCORRECT_NAME_RANGE;
            throw new IllegalArgumentException(exceptionMessage.toString());
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
