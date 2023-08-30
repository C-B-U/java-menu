package menu.constant;

public enum OutputElement {
    FIRST_ELEMENT("[ "),
    MIDDLE_ELEMENT(" | "),
    LAST_ELEMENT(" ]"),
    NEXT_ELEMENT("\n");


    private final String element;

    OutputElement(String element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return element;
    }
}
