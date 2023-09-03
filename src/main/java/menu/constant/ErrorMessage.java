package menu.constant;

public enum ErrorMessage {
    COACH_NAME_INPUT_ERROR("잘못된 코치 이름 입력입니다."),
    INVALID_COACH_NUM_ERROR("코치 수가 잘못되었습니다."),
    INVALID_COACH_NAME_LENGTH("코치의 이름 길이가 잘못되었습니다."),
    INVALID_MENU_NAME("잘못된 메뉴명입니다."),
    NO_MATCHING_INDEX("인덱스에 해당하는 값이 없습니다.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(final String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return PREFIX + this.message;
    }
}
