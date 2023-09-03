package menu.domain;

import menu.constant.ErrorMessage;

import java.util.List;
import java.util.stream.Collectors;

public class CoachList {
    private static final int MIN_COACH_NUM = 2;
    private final List<Coach> coaches;

    public CoachList(final List<String> coaches) {
        validateSize(coaches);
        this.coaches = coaches.stream().map(Coach::new).collect(Collectors.toList());
    }

    private void validateSize(final List<String> coaches) {
        if (coaches.size() < MIN_COACH_NUM) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_COACH_NUM_ERROR.toString());
        }
    }
}
