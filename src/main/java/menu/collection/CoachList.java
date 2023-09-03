package menu.collection;

import menu.constant.ErrorMessage;
import menu.domain.Coach;

import java.util.List;
import java.util.stream.Collectors;

public class CoachList {
    private static final int MIN_COACH_NUM = 2;
    private final List<Coach> coaches;
    private Integer index;

    public CoachList(final List<String> coaches) {
        validateSize(coaches);
        this.coaches = coaches.stream().map(Coach::new).collect(Collectors.toList());
        this.index = 0;
    }

    private void validateSize(final List<String> coaches) {
        if (coaches.size() < MIN_COACH_NUM) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_COACH_NUM_ERROR.toString());
        }
    }

    public Coach getNextCoach() {
        final Coach coach = this.coaches.get(index++);
        checkIndex();
        return coach;
    }

    private void checkIndex() {
        if (index >= getCoachNum()) {
            index = 0;
        }
    }

    public int getCoachNum() {
        return coaches.size();
    }
}
