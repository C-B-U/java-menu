package menu.model;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.Categories;
import menu.constant.OutputElement;

import java.util.ArrayList;
import java.util.List;

public class RecommendCategory {

    private static final String CATEGORY = "카테고리";
    private static final int CATEGORY_COUNT = 5;
    private static final int MAX_DUPLICATE_COUNT = 2;
    private final List<String> categories = new ArrayList<>();

    public void createRecommendCategory() {
        while (categories.size() < CATEGORY_COUNT){
            String newCategory = Categories.getType(Randoms.pickNumberInRange(1, 5));
            if (canAddCategory(newCategory)){
                categories.add(newCategory);
            }
        }
    }

    private boolean canAddCategory(String newCategory) {
        long count = categories.stream()
                .filter(category -> category.equals(newCategory))
                .count();
        return count < MAX_DUPLICATE_COUNT;
    }

    public List<String> getCategories() {
        return categories;
    }

    public int getCategoryCount(){
        return categories.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(OutputElement.FIRST_ELEMENT).append(CATEGORY);
        for (String category : categories){
            stringBuilder.append(OutputElement.MIDDLE_ELEMENT)
                    .append(category);
        }
        stringBuilder.append(OutputElement.LAST_ELEMENT);
        return stringBuilder.toString();
    }
}


