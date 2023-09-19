package menu.domain;

import menu.constants.ErrorMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static menu.view.InputValidator.DIVISION;

public class Coaches {

    private static final int MIN_COACH_NUMBER = 2;
    private static final int MAX_COACH_NUMBER = 5;
    private final List<Coach> coaches = new ArrayList<>();

    public Coaches(String names) {
        String[] coachNames = names.split(DIVISION);
        validateCoachNumber(coachNames.length);
        addCoaches(coachNames);
    }

    private void validateCoachNumber(int number) {
        if (number < MIN_COACH_NUMBER || number > MAX_COACH_NUMBER) {
            throw new IllegalArgumentException(ErrorMessage.COACH_NUMBER_ERROR.getMessage());
        }
    }

    private void addCoaches(String[] coachNames) {
        coaches.addAll(Arrays.stream(coachNames)
                .map(String::trim)
                .map(Coach::new)
                .collect(Collectors.toList()));
    }

    public List<Coach> getCoaches() {
        return coaches;
    }
}
