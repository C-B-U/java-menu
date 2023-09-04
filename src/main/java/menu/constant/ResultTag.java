package menu.constant;

public enum ResultTag {
    START_TAG("[ "),
    DELIMITER(" | "),
    END_TAG(" ]");

    private final String tag;

    ResultTag(final String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return this.tag;
    }
}
