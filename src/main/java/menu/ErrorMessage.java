package menu;

public enum ErrorMessage {
    NO_BLANK("입력에 공백이 포함되면 안 됩니다. 다시 입력해 주십시오.\n"),
    COACHES_SEPARATED_COMMA("코치 이름은 ,로 구분되어야 합니다. 다시 입력해 주십시오.\n"),
    FOODS_SEPARATED_COMMA("못먹는 음식은 ,로 구분되어야 합니다. 다시 입력해 주십시오.\n"),
    COACH_NAME_MUST_BE_KOREAN("코치 이름은 한글이어야 합니다. 다시 입력해 주십시오.\n"),
    NUMBER_OF_COACHES("코치 인원은 2명 이상 5명 이하여야 합니다. 다시 입력해 주십시오.\n"),
    COACH_NAME_LENGTH("코치 이름은 2글자 이상 4글자 이하여야  합니다. 다시 입력해 주십시오.\n"),
    FOOD_COUNT("못먹는 음식은 0개 이상 2개 이하만 가능합니다. 다시 입력해 주십시오.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    String getMessage() {
        return PREFIX + message;
    }
}
