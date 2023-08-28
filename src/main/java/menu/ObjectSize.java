package menu;

public enum ObjectSize {
    MINIMUM_NAME_LENGTH(2),
    MAXIMUM_NAME_LENGTH(4),
    MAXIMUM_FOOD_LIST_SIZE(2),
    MINIMUM_COACH_LIST_SIZE(2),
    MAXIMUM_COACH_LIST_SIZE(5);

    final int size;

    ObjectSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
