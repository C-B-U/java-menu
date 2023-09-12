package menu.constant;

public enum ExceptionMessage {

    INCORRECT_DELIMITER("','로 구분하여 입력해야합니다."),
    INCORRECT_NAME_RANGE("코치의 이름은 2~4자까지 입력할 수 있습니다."),
    INCORRECT_COACH_NUMBER("코치는 2명 이상, 5명 이하만 입력할 수 있습니다."),
    INCORRECT_RECOMMEND("등록되지 않은 카테고리입니다."),
    EXCLUDED_FOOD_SIZE("못먹는 음식은 0~2개까지 입력가능합니다.");

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return PREFIX + message;
    }
}