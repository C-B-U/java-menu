package menu;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

public class InputView {
    private static final OutputView outputView = new OutputView();
    private static final InputValidator inputValidator = new InputValidator();
    private static final String COMMA = ",";

    public List<String> readCoachNames() {
        String names;
        do {
            names = inputCoachNames();
        } while (names == null);
        return Arrays.asList(names.split(COMMA));
    }

    private String inputCoachNames() {
        String input;
        try {
            input = Console.readLine();
            inputValidator.validateCoachNames(input);
        } catch (IllegalArgumentException exception) {
            outputView.printExceptionMessage(exception);
            return null;
        }
        return input;
    }

    public List<String> readFoodCannotEat() {
        String foods;
        do {
            foods = inputHateFood();
        } while (foods == null);
        return Arrays.asList(foods.split(COMMA));
    }

    private String inputHateFood() {
        String input;
        try {
            input = Console.readLine();
            inputValidator.validateFoods(input);
        } catch (IllegalArgumentException exception) {
            outputView.printExceptionMessage(exception);
            return null;
        }
        return input;
    }
}
