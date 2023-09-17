package menu;

import java.util.Scanner;
import java.util.function.Supplier;

public class InputView {

    private final InputValidator inputValidator = new InputValidator();
    private final OutputView outputView = new OutputView();
    private final Scanner scanner = new Scanner(System.in);

    public Coaches inputCoachName(){
        return read(() -> {
            outputView.printProgressCoachNameMessage();
            String names = scanner.next();
            inputValidator.validateContainComma(names);
            return new Coaches(names);
        });
    }



    private <T> T read(Supplier<T> supplier){
        while (true){
            try {
                return supplier.get();
            } catch (IllegalArgumentException e){
                outputView.printErrorMessage(e.getMessage());
            }
        }
    }
}
