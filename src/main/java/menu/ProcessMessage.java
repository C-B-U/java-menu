package menu;

public enum ProcessMessage {
    START_MESSAGE("점심 메뉴 추천을 시작합니다.\n"),
    INPUT_NAME_MESSAGE("코치의 이름을 입력해 주세요. (, 로 구분)"),
    INPUT_CANNOT_EAT_FOOD_MESSAGE("(이)가 못 먹는 메뉴를 입력해 주세요."),
    RECOMMEND_MESSAGE("메뉴 추천 결과입니다."),
    WEEKDAY_MESSAGE("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]"),
    FINISH_MESSAGE("추천을 완료했습니다."),
    NEW_LINE_MESSAGE("\n");

    private final String message;

    ProcessMessage(String message) {
        this.message = message;
    }

    String getMessage() {
        return message;
    }
}
