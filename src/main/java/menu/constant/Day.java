package menu.constant;

import java.util.Arrays;

public enum Day {
    MONDAY("월요일", 0),
    TUESDAY("화요일", 1),
    WEDNESDAY("수요일", 2),
    THURSDAY("목요일", 3),
    FRIDAY("금요일", 4);

    private final String day;
    private final Integer order;

    Day(final String day, final Integer order) {
        this.day = day;
        this.order = order;
    }

    public static Day getByOrder(final int order) {
        return Arrays.stream(values())
                .filter(d -> d.order == order)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.INVALID_INDEX.toString()));
    }

    @Override
    public String toString() {
        return this.day;
    }
}
