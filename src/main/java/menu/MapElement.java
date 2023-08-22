package menu;

public enum MapElement {
    OPEN_BRACKET("[ "),
    CLOSE_BRACKET(" ]"),
    DELIMITER(" | "),
    NEW_LINE("\n");

    private final String element;

    MapElement(String element) {
        this.element = element;
    }

    public String get() {
        return element;
    }
}

