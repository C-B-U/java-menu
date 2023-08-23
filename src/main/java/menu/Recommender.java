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

    public void run(List<Coach> coachInformation) {
        information = coachInformation;
        categoryMap = new CategoryMap();
        menuMap = new MenuMap(information);
        select();
    }

    public String getRecommendMenus() {
        return categoryMap.getCategoryMap() + menuMap.getMenuMap();
    }

    private void select() {
        while(categoryMap.getSize() < WEEK_DAY_LENGTH) {
            selectCategory(categoryMap);
        }
    }

    private void selectCategory(CategoryMap categoryMap) {
        Category category = categories.get(Randoms.pickNumberInRange(1, 5) - MINUS_INDEX);
        if (!categoryMap.isDuplicateMoreThanTwice(category)) {
            selectFoods(category.getMenus());
            categoryMap.add(category.getType());
        }
    }

    private void selectFoods(List<String> menus) {
        information.forEach(coach -> {
            String recommend;
            boolean duplicated;
            do {
                recommend = Randoms.shuffle(menus).get(0);
                duplicated = menuMap.isDuplicate(coach.getName(), recommend);
            } while (duplicated || coach.isHateFood(recommend));
            menuMap.add(coach.getName(), recommend);
        });
    }
}
