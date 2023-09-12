package menu.constant;

public enum OutputMessage {

    START_RECOMMEND("점심 메뉴 추천을 시작합니다."),
    READ_NAMES("코치의 이름을 입력해 주세요. (, 로 구분)"),
    READ_EXCLUDED_MENU("%s(이)가 못 먹는 메뉴를 입력해 주세요."),
    RECOMMEND_RESULT("메뉴 추천 결과입니다."),
    COMPLETE_RECOMMEND("추천을 완료했습니다."),
    DAYS("구분"),
    CATEGORIES("카테고리");

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
