package menu.constant;

public enum ErrorMessage {
    INVALID_DELIMITER_USAGE("구분자의 사용이 잘못되었습니다."),
    INVALID_COACH_NUM_ERROR("코치 수가 잘못되었습니다."),
    INVALID_COACH_NAME_LENGTH("코치의 이름 길이가 잘못되었습니다."),
    INVALID_MENU_NAME("잘못된 메뉴명입니다."),
    NO_MATCHING_INDEX("인덱스에 해당하는 값이 없습니다."),
    CANNOT_FIND_CATEGORY("카테고리를 찾을 수 없습니다."),
    INVALID_HATE_MENU_NUM("잘못된 못먹는 음식 개수입니다.");

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
