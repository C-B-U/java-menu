package menu.domain;

import menu.constant.MenuCategory;

import java.util.stream.Collectors;

public class RecommendResult {

    private static final String START_TAG = "[ ";
    private static final String DELIMITER_TAG = " | ";
    private static final String END_TAG = " ]";
    private static final String NEW_LINE = "\n";
    private static final String CATEGORY = "카테고리";
    private final Coaches coaches;
    private final MenuCategories menuCategories;

    public RecommendResult(final Coaches coaches, final MenuCategories menuCategories) {
        this.coaches = coaches;
        this.menuCategories = menuCategories;
    }

    public String getResult() {
        return START_TAG + CATEGORY + DELIMITER_TAG + menuCategories.getMenuCategories().stream()
                .map(MenuCategory::getCategoryName)
                .collect(Collectors.joining(DELIMITER_TAG)) + END_TAG + NEW_LINE
                + coaches.getCoaches().stream()
                .map(coach -> START_TAG + coach.getName() + DELIMITER_TAG + String.join(DELIMITER_TAG, coach.getRecommendedMenus()) + END_TAG)
                .collect(Collectors.joining(NEW_LINE)) + NEW_LINE;
    }
}
