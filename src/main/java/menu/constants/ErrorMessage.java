package menu.constants;

public enum ErrorMessage {
    DIVISION_COMMA_ERROR("(, 로 구분)되지 않았습니다."),
    COACH_NAME_LENGTH_ERROR("코치 이름은 최소 2글자, 최대 4글자까지 입력가능 합니다."),
    COACH_NUMBER_ERROR("코치는 최소 2명, 최대 5명자까지 입력가능 합니다."),
    COACH_FORBIDDEN_MENU_NUMBER_ERROR("각 코치가 못 먹는 메뉴는 최소 0개, 최대 2개의 입니다."),
    CATEGORY_NUMBER_ERROR("존재하지 않는 카테고리 번호입니다."),
    MENU_TYPE_ERROR("존재하지 않는 음식종류 입니다.");

    private static final String error = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return error + message;
    }
}
