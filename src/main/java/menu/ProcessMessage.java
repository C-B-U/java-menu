package menu;

public enum ProcessMessage {
    InputCoachName("코치의 이름을 입력해 주세요. (, 로 구분)");

    private final String message;

    ProcessMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
