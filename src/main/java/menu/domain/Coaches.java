package menu.domain;

import menu.constant.ErrorMessage;

import java.util.Collections;
import java.util.List;

public class Coaches {

    private static final int MIN_COACH_NUM = 2;
    private static final int MAX_COACH_NUM = 5;
    private final List<Coach> coaches;

    public Coaches(final List<Coach> coaches) {
        validateSize(coaches);
        this.coaches = Collections.unmodifiableList(coaches);
    }

    private void validateSize(final List<Coach> coaches) {
        final int size = coaches.size();
        if (size < MIN_COACH_NUM || size > MAX_COACH_NUM) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_COACH_NUM.getMessage());
        }
    }
}
