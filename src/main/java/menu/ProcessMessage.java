package menu;

public enum ProcessMessage {
    INPUT_COACH_NAME("코치의 이름을 입력해 주세요. (, 로 구분)"),
    INPUT_FORBIDDEN_MENU("%s(이)가 못 먹는 메뉴를 입력해 주세요.");

    private final String message;

    ProcessMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
