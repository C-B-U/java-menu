package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.OutputMessage;
import menu.constant.ResultElement;

import java.util.*;

public class Categories {

    private static final int RECOMMEND_COUNT = 5;
    private static final int MAX_RECOMMEND_COUNT = 2;
    private static final int START_RANDOM_NUMBER = 1;
    private static final int END_RANDOM_NUMBER = 5;

    private final List<Category> elements;

    public Categories() {
        this.elements = recommendCategory();
    }

    private List<Category> recommendCategory() {
        List<Category> categories = new ArrayList<>();
        while (categories.size() < RECOMMEND_COUNT) {
            Category category = randomRecommend();
            if (isDuplicateRecommend(categories, category)) {
                continue;
            }
            categories.add(category);
        }
        return categories;
    }

    private Category randomRecommend() {
        int random = Randoms.pickNumberInRange(START_RANDOM_NUMBER, END_RANDOM_NUMBER);
        return Category.getRecommendFood(random);
    }

    private boolean isDuplicateRecommend(List<Category> categories, Category recommendCategory) {
        return categories.stream()
                .filter(category -> category == recommendCategory)
                .count() >= MAX_RECOMMEND_COUNT;
    }

    public List<Category> getElements() {
        return Collections.unmodifiableList(elements);
    }

    public String getCategories() {
        String delimiter = ResultElement.DELIMITER.toString();
        String start = ResultElement.START.toString();
        String end = ResultElement.END.toString();

        StringJoiner stringJoiner = new StringJoiner(delimiter, start, end);

        stringJoiner.add(OutputMessage.CATEGORIES.getMessage());
        elements.forEach(element -> stringJoiner.add(element.toString()));
        return stringJoiner.toString();
    }
}
