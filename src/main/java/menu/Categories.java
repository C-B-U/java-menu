package menu;

import java.util.Arrays;

public enum Categories {
    JAPANESE(1, "일식"),
    KOREAN(2, "한식"),
    CHINESE(3, "중식"),
    AISIAN(4, "아시안"),
    WESTERN(5, "양식");

    private final int number;
    private final String type;

    Categories(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public static Categories findCategory(int number) {
        return Arrays.stream(values())
                .filter(categories -> categories.number == number)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.CATEGORY_NUMBER_ERROR.getMessage()));
    }
}
