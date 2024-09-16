package menu.constant;

public enum ResultElement {
    START("[ "),
    END(" ]"),
    DELIMITER(" | ");


    private final String element;

    ResultElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return this.element;
    }
}
