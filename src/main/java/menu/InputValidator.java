package menu;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class InputValidator {
    private static final String REGEX = "^[가-힣]*$";
    private static final String COMMA = ",";
    private static final String BLANK = " ";

    public void validateCoachNames(String names) {
        validateStringHasBlank(names);
        validateNamesSeparatedByComma(names);
    }

    public void validateFoods(String foods) {
        validateStringHasBlank(foods);
        validateFoodsSeparatedByComma(foods);
    }
    private void validateStringHasBlank(String string) {
        if (string.contains(BLANK)) {
            throw new IllegalArgumentException(ErrorMessage.NO_BLANK.getMessage());
        }
    }

    private void validateFoodsSeparatedByComma(String foods) {
        List<String> foodsList;
        try {
            foodsList = Arrays.asList(foods.split(COMMA));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorMessage.FOODS_SEPARATED_COMMA.getMessage());
        }
        validateFoodCount(foodsList);
    }

    private void validateFoodCount(List<String> foods) {
        if(foods.size() > ObjectSize.MAXIMUM_FOOD_LIST_SIZE.getSize()) {
            throw new IllegalArgumentException(ErrorMessage.FOOD_COUNT.getMessage());
        }
    }

    private void validateNamesSeparatedByComma(String names) {
        List<String> coachNames;
        try {
            coachNames = Arrays.asList(names.split(COMMA));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(ErrorMessage.COACHES_SEPARATED_COMMA.getMessage());
        }
        validateNumberOfCoaches(coachNames);
        validateCoachNameLength(coachNames);
        validateCoachNameIsString(coachNames);
    }

    private void validateCoachNameIsString(List<String> coachNames) {
        if (!coachNames.stream().allMatch(name -> Pattern.matches(REGEX, name))) {
            throw new IllegalArgumentException(ErrorMessage.COACH_NAME_MUST_BE_KOREAN.getMessage());
        }
    }

    private void validateCoachNameLength(List<String> coachNames) {
        if (coachNames.stream().anyMatch(name -> name.length() < ObjectSize.MINIMUM_NAME_LENGTH.getSize()
                || name.length() > ObjectSize.MAXIMUM_NAME_LENGTH.getSize())) {
            throw new IllegalArgumentException(ErrorMessage.COACH_NAME_LENGTH.getMessage());
        }
    }

    private void validateNumberOfCoaches(List<String> coachNames) {
        if (coachNames.size() < ObjectSize.MINIMUM_COACH_LIST_SIZE.getSize()
                || coachNames.size() > ObjectSize.MAXIMUM_COACH_LIST_SIZE.getSize()) {
            throw new IllegalArgumentException(ErrorMessage.NUMBER_OF_COACHES.getMessage());
        }
    }
}