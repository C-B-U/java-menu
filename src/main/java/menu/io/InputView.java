package menu.io;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private final InputValidator inputValidator;

    public InputView(final InputValidator inputValidator) {
        this.inputValidator = inputValidator;
    }

    public String readCoach() {
        final String input = Console.readLine();
        inputValidator.validateSplitter(input);
        return input;
    }

    public String readCoachMenu() {
        final String input = Console.readLine();
        inputValidator.validateCoachMenu(input);
        return input;
    }
}
