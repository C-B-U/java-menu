package menu;

import camp.nextstep.edu.missionutils.Console;
import java.util.function.Supplier;


public class InputView {

    private final OutputView outputView = new OutputView();
    private final InputValidator inputValidator = new InputValidator();


    public CoachNames inputCoachName(){
        return attemptInput(() -> {
            outputView.printCoachNameMessage();
            String coachName = Console.readLine();
            inputValidator.validateCommaContain(coachName);
            return new CoachNames(coachName);
        });
    }

    public ForbiddenMenu inputForbiddenMenu(CoachNames coachNames){
        ForbiddenMenu forbiddenMenu = new ForbiddenMenu();
        return attemptInput(() -> {
            for (String coachName: coachNames.getCoachNames()){
                outputView.printCoachesForbiddenMenu(coachName);
                String inputMenu = Console.readLine();
                inputValidator.validateForbiddenMenuCount(inputMenu);
                forbiddenMenu.add(coachName, inputMenu);
            }
            return forbiddenMenu;
        });
    }

    private <T> T attemptInput(Supplier<T> supplier){
        try{
            return supplier.get();
        }catch (IllegalArgumentException e){
            outputView.printErrorMessage(e.getMessage());
            return supplier.get();
        }
    }
}
