package menu.view;

import menu.constants.ErrorMessage;

public class InputValidator {

    public static final String DIVISION = ",";
    private static final int MAX_FORBIDDEN_MENU_SIZE = 2;

    public void validateContainComma(String names) {
        if (!names.contains(DIVISION)) {
            throw new IllegalArgumentException(ErrorMessage.DIVISION_COMMA_ERROR.getMessage());
        }
    }

    public void validateForbiddenMenuNumber(String menus) {
        String[] menuNames = menus.split(DIVISION);
        if (menuNames.length > MAX_FORBIDDEN_MENU_SIZE) {
            throw new IllegalArgumentException(ErrorMessage.COACH_FORBIDDEN_MENU_NUMBER_ERROR.getMessage());
        }
    }
}
