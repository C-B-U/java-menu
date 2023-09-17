package menu;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RecommendCategory {

    private static final int MAX_DUPLICATE_COUNT = 2;
    private static final int MIN_CATEGORY_NUM = 1;
    private static final int MAX_CATEGORY_NUM = 5;

    List<String> categories = new ArrayList<>();


    public void randomCategory(){
        String category = Categories.findCategory(Randoms.pickNumberInRange(MIN_CATEGORY_NUM, MAX_CATEGORY_NUM));
        if (canAddCategory(category)){
            categories.add(category);
        }
    }

    private boolean canAddCategory(String newCategory) {
        long count = categories.stream()
                .filter(category -> category.equals(newCategory))
                .count();
        return count < MAX_DUPLICATE_COUNT;
    }
}