package menu.domain;

import menu.constant.ExceptionMessage;

import java.util.Arrays;

public enum Category {

    JAPANESE(1, "일식"),
    KOREAN(2, "한식"),
    CHINESE(3, "중식"),
    ASIAN(4, "아시안"),
    WESTERN(5, "양식");

    private final int index;
    private final String type;

    Category(int index, String type) {
        this.index = index;
        this.type = type;
    }

    public static Category getRecommendFood(int randomNumber) {
        return Arrays.stream(Category.values())
                .filter(category -> category.index == randomNumber)
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(ExceptionMessage.INCORRECT_RECOMMEND.toString()));
    }

    @Override
    public String toString() {
        return type;
    }
}
