package menu.domain;

import menu.constant.ExceptionMessage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Names {

    private static final int MIN_RANGE = 2;
    private static final int MAX_RANGE = 5;

    private final List<Name> elements;

    public Names(List<Name> names) {
        validateRange(names);
        this.elements = new ArrayList<>(names);
    }

    private void validateRange(List<Name> names) {
        if (!(MIN_RANGE <= names.size() && names.size() <= MAX_RANGE)) {
            throw new IllegalArgumentException(ExceptionMessage.INCORRECT_COACH_NUMBER.toString());
        }
    }

    public List<Name> getElements() {
        return Collections.unmodifiableList(elements);
    }
}