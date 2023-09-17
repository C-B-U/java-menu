package menu.constants;

public enum ScreenElement {
    FIRST_ELEMENT("[ "),
    MIDDLE_DIVISION(" | "),
    LAST_ELEMENT(" ]");
    private final String value;

    ScreenElement(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
