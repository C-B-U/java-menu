package menu.model;

import menu.constant.ErrorMessage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoachNames {

    private final static int MIN_NAME_LENGTH = 2;
    private final static int MAX_NAME_LENGTH = 4;
    private final static int MIN_COACH_COUNT = 2;
    private final static int MAX_COACH_COUNT = 5;
    private final static String BY_COMMA = ",";
    private final List<String> coachNames = new ArrayList<>();

    public CoachNames(String name) {
       Arrays.stream(name.split(BY_COMMA))
                .forEach(this::addValidateCoachName);
       validateCoachNumber();
    }

    private void addValidateCoachName(String name){
        validateCoachNameLength(name);
        coachNames.add(name);
    }

    private void validateCoachNameLength(String name) {
        if (name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(
                    String.format(ErrorMessage.COACH_NAME_LENGTH_ERROR.toString(), MIN_NAME_LENGTH, MAX_NAME_LENGTH));
        }
    }

    private void validateCoachNumber(){
        if (coachNames.size() < MIN_COACH_COUNT || coachNames.size() > MAX_COACH_COUNT){
            throw new IllegalArgumentException(
                    String.format(ErrorMessage.COACH_NAME_NUMBER_ERROR.toString(), MIN_COACH_COUNT, MAX_COACH_COUNT));
        }
    }

    public List<String> getCoachNames() {
        return coachNames;
    }
}
