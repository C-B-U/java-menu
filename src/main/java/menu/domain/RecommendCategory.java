package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constants.Categories;
import menu.constants.ScreenElement;

import java.util.ArrayList;
import java.util.List;

public class RecommendCategory {

    private static final int MAX_DUPLICATE_COUNT = 2;
    private static final int MIN_CATEGORY_NUM = 1;
    private static final int MAX_CATEGORY_NUM = 5;
    private static final String TAG = "카테고리";
    private final List<String> categories = new ArrayList<>();


    public boolean isAddingRandomCategory() {
        String category = Categories.findCategory(Randoms.pickNumberInRange(MIN_CATEGORY_NUM, MAX_CATEGORY_NUM));
        if (canAddCategory(category)) {
            categories.add(category);
            return true;
        }
        return false;
    }

    private boolean canAddCategory(String newCategory) {
        long count = categories.stream()
                .filter(category -> category.equals(newCategory))
                .count();
        return count < MAX_DUPLICATE_COUNT;
    }

    public boolean canRecommendCategory() {
        return categories.size() < MAX_CATEGORY_NUM;
    }

    public String getDaysCategory() {
        return categories.get(categories.size() - 1);
    }

    public String showRecommendCategory() {
        StringBuilder sb = new StringBuilder();
        sb.append(ScreenElement.FIRST_ELEMENT).append(TAG);
        for (String category : categories) {
            sb.append(ScreenElement.MIDDLE_DIVISION).append(category);
        }
        sb.append(ScreenElement.LAST_ELEMENT);
        return sb.toString();
    }
}