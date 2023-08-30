package menu.constant;

import java.util.Arrays;
import java.util.function.Predicate;

public enum Categories {
    JAPANESE(1, "일식"),
    KOREAN(2, "한식"),
    CHINESE(3, "중식"),
    ASIAN(4, "아시안"),
    WESTERN(5, "양식");


    private final int number;
    private final String type;

    Categories(int number, String type) {
        this.number = number;
        this.type = type;
    }

    public static String getType(int number) {
        return Arrays.stream(Categories.values())
                .filter(isSameNumber(number))
                .map(categories -> categories.type)
                .findFirst()
                .orElse(null);
    }

    private static Predicate<Categories> isSameNumber(int number) {
        return categories -> categories.number == number;
    }
}
