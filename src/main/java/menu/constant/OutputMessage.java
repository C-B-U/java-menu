package menu.constant;

public enum OutputMessage {

    START_MESSAGE("점심 메뉴 추천을 시작합니다."),
    COACH_NAME("코치의 이름을 입력해 주세요. (, 로 구분)"),
    EXCLUDED_FOOD("%s(이)가 못 먹는 메뉴를 입력해 주세요.\n"),
    DAYS_TITLE("구분"),
    MENU_RESULT("메뉴 추천 결과입니다."),
    COMPLETE("추천을 완료했습니다.");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}