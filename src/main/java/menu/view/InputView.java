package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.model.CoachNames;
import menu.model.ForbiddenMenu;
import menu.view.validate.InputValidator;


public class InputView {

    private final OutputView outputView = new OutputView();
    private final InputValidator inputValidator = new InputValidator();

    public CoachNames readCoachName(){
        CoachNames coachNames;
        do {
            coachNames = inputCoachName();
        }while (coachNames == null);
        return coachNames;
    }


    private CoachNames inputCoachName(){
        outputView.printCoachNameMessage();
        String coachName = Console.readLine();
        outputView.printEnter();
        try{
            inputValidator.validateCommaContain(coachName);
            return new CoachNames(coachName);
        } catch (IllegalArgumentException e){
            outputView.printErrorMessage(e.getMessage());
            return null;
        }
    }

    public ForbiddenMenu readForbiddenMenu(CoachNames coachNames){
        ForbiddenMenu forbiddenMenu;
        do {
            forbiddenMenu = inputForbiddenMenu(coachNames);
        }while (forbiddenMenu == null);
        return forbiddenMenu;
    }

    private ForbiddenMenu inputForbiddenMenu(CoachNames coachNames){
        ForbiddenMenu forbiddenMenu = new ForbiddenMenu();
        for (String coachName: coachNames.getCoachNames()){
            outputView.printCoachesForbiddenMenu(coachName);
            String inputMenu = Console.readLine();
            outputView.printEnter();
            try {
                inputValidator.validateForbiddenMenuCount(inputMenu);
                forbiddenMenu.add(coachName, inputMenu);
            }catch (IllegalArgumentException e){
                outputView.printErrorMessage(e.getMessage());
                return null;
            }
        }
        return forbiddenMenu;
    }
}
