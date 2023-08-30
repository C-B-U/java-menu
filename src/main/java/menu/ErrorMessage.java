package menu;

public enum ErrorMessage {

    COACH_NAME_LENGTH_ERROR("코치 이름은 %d~%d글자 사이로 입력되어야 합니다."),
    COACH_NAME_NUMBER_ERROR("코치는 최소 %d명, 최대 %d명 입력되어야 합니다."),

    INPUT_COMMA_ERROR(", 로 구분되어 이름을 입력해주세요.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
