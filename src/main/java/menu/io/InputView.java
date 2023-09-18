package menu.io;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private final InputValidator inputValidator = new InputValidator();

    public String readCoachNames() {
        final String input = Console.readLine();
        inputValidator.validateInputDelimiter(input);
        return input;
    }
}
