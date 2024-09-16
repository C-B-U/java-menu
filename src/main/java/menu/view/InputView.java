package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.domain.Name;
import menu.validator.InputValidator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputView {

    InputValidator inputValidator = new InputValidator();
    OutputView outputView = new OutputView();

    public List<Name> readNames() {
        return attemptedInput(() -> {
            outputView.printNameMessage();
            String names = Console.readLine();
            outputView.printNewLine();
            inputValidator.validateDelimiter(names);
            return Arrays.stream(names.split(","))
                    .map(Name::new)
                    .collect(Collectors.toList());
        });
    }

    public List<String> readExcludedFood() {
        return attemptedInput(() -> {
            String foods = Console.readLine();
            inputValidator.validateDelimiter(foods);
            return Stream.of(foods.split(","))
                    .collect(Collectors.toList());
        });
    }

    private <T> T attemptedInput(Supplier<T> supplier) {
        try {
            return supplier.get();
        } catch (IllegalArgumentException exception) {
            outputView.printExceptionMessage(exception.getMessage());
            return supplier.get();
        }
    }
}
