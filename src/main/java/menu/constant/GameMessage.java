package menu.constant;

public enum GameMessage {
    START("점심 메뉴 추천을 시작합니다.");

    private final String message;

    GameMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
