package menu.constant;

public enum ErrorMessage {
    INVALID_COACH_NAME_LENGTH("코치 이름 길이가 잘못되었습니다."),
    INVALID_COACH_NUM("코치의 인원수가 잘못되었습니다."),
    INVALID_INPUT_DELIMITER_USAGE("쉼표는 맨 처음이나 끝에 올 수 없습니다.");

    private static final String ERROR_PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return ERROR_PREFIX + this.message;
    }
}
