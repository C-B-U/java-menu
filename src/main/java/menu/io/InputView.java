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
}
