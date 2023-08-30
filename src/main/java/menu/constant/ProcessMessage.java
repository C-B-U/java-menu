package menu.constant;

public enum ProcessMessage {
    INPUT_COACH_NAME("코치의 이름을 입력해 주세요. (, 로 구분)"),
    INPUT_FORBIDDEN_MENU("%s(이)가 못 먹는 메뉴를 입력해 주세요."),
    OUTPUT_START_MENU("점심 메뉴 추천을 시작합니다."),
    OUTPUT_RESULT_MENU("메뉴 추천 결과입니다."),
    OUTPUT_FINISH_MENU("추천을 완료했습니다.");

    private final String message;

    ProcessMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
