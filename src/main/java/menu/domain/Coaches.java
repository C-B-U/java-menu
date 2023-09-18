package menu.domain;

import menu.constant.ErrorMessage;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Coaches {

    private static final int MIN_COACH_NUM = 2;
    private static final int MAX_COACH_NUM = 5;
    private static final int INIT_INDEX = 0;
    private final List<Coach> coaches;
    private int currentIndex;

    public Coaches(final List<Coach> coaches) {
        validate(coaches);
        this.coaches = Collections.unmodifiableList(coaches);
        this.currentIndex = INIT_INDEX;
    }

    private void validate(final List<Coach> coaches) {
        final int size = coaches.size();
        if (size < MIN_COACH_NUM || size > MAX_COACH_NUM || new HashSet<>(coaches).size() != coaches.size()) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_COACH_NUM.getMessage());
        }
    }

    public String getNextCoachName() {
        checkCurrentIndex();
        return coaches.get(currentIndex++).getName();
    }

    private void checkCurrentIndex() {
        if (currentIndex == coaches.size()) {
            currentIndex = INIT_INDEX;
        }
    }

    public boolean isLast() {
        final boolean flag = currentIndex == coaches.size();
        if (flag) {
            currentIndex = INIT_INDEX;
        }
        return flag;
    }

    public Coach findByName(final String coachName) {
        return this.coaches.stream()
                .filter(coach -> coach.hasName(coachName))
                .findAny()
                .orElseThrow(() -> new IllegalStateException(ErrorMessage.INVALID_COACH_NAME.getMessage()));
    }

    public Coach getNextCoach() {
        checkCurrentIndex();
        return this.coaches.get(currentIndex++);
    }

    public List<Coach> getCoaches() {
        return this.coaches;
    }
}
