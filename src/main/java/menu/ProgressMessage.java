package menu;

public enum ProgressMessage {
    INPUT_COACH_NAME("코치의 이름을 입력해 주세요. (, 로 구분)");
    private final String message;

    ProgressMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
