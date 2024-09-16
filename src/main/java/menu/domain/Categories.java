package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.Category;
import menu.constant.ResultElement;

import java.util.*;

public class Categories {

    private static final int RECOMMEND_NUMBER = 5;
    private static final int MAX_RECOMMEND_COUNT = 2;
    private static final String TITLE = "카테고리";

    private final List<Category> categories;
    private final Map<Category, Integer> categoriesCount;

    public Categories() {
        this.categoriesCount = new EnumMap<>(Category.class);
        Arrays.stream(Category.values())
                .forEach(category -> categoriesCount.put(category, 0));
        this.categories = recommendCategory();
    }

    private List<Category> recommendCategory() {
        List<Category> categories = new ArrayList<>();
        while (categories.size() < RECOMMEND_NUMBER) {
            Category recommendCategory = Category.getRecommendFood(Randoms.pickNumberInRange(1, 5));
            if (isNotThreeTimes(recommendCategory)) {
                categories.add(recommendCategory);
                categoriesCount.put(recommendCategory, increaseCount(recommendCategory));
            }
        }
        return List.copyOf(categories);
    }

    private boolean isNotThreeTimes(Category recommendCategory) {
        return categoriesCount.get(recommendCategory) < MAX_RECOMMEND_COUNT;
    }

    private int increaseCount(Category category) {
        return categoriesCount.get(category) + 1;
    }

    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(ResultElement.DELIMITER.toString(), ResultElement.START.toString(), ResultElement.END.toString());
        stringJoiner.add(TITLE);
        categories.forEach(
                (category) -> stringJoiner.add(category.toString())
        );
        return stringJoiner.toString();
    }
}
