package menu.constant;

import java.util.Arrays;

public enum Category {
    JAPANESE_FOOD(1, "일식"),
    KOREAN_FOOD(2, "한식"),
    CHINESE_FOOD(3, "중식"),
    ASIAN_FOOD(4, "아시안"),
    WESTERN_FOOD(5, "양식");

    private final int index;
    private final String toKorean;

    Category(final int index, final String toKorean) {
        this.index = index;
        this.toKorean = toKorean;
    }

    public static Category getByIndex(final int index) {
        return Arrays.stream(values())
                .filter(c -> c.index == index)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.NO_MATCHING_INDEX.toString()));
    }

    @Override
    public String toString() {
        return this.toKorean;
    }
}
