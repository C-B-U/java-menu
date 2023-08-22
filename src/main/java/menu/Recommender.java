package menu;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;
import java.util.List;

public class Recommender {
    private static final int WEEK_DAY_LENGTH = 5;
    private static final int MINUS_INDEX = 1;
    private final List<Category> categories = Arrays.asList(Category.values());
    private List<Coach> information;
    private CategoryMap categoryMap;
    private MenuMap menuMap;

    public String run(List<Coach> coachInformation) {
        information = coachInformation;
        categoryMap = new CategoryMap();
        menuMap = new MenuMap(information);
        select();
        return categoryMap.draw() + menuMap.draw();
    }

    private void select() {
        while(categoryMap.getSize() < WEEK_DAY_LENGTH) {
            selectCategory(categoryMap);
        }
    }

    private void selectCategory(CategoryMap categoryMap) {
        // 테스트코드 때문에 MINUS-INDEX 작성
        // Randoms.pickNumberInRange(0, 4)로 돌려주면 MINUS 없어도 됨
        Category category = categories.get(Randoms.pickNumberInRange(1, 5) - MINUS_INDEX);
        if (categoryMap.isNotDuplicate(category)) {
            categoryMap.add(category.getType());
        }
    }
}
