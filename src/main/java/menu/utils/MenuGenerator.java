package menu.utils;

import camp.nextstep.edu.missionutils.Randoms;
import menu.domain.*;
import menu.constant.Category;

import java.util.List;
import java.util.stream.IntStream;

public class MenuGenerator {
    private static final int MIN_INDEX = 0;
    private static final int MAX_INDEX = 5;
    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 5;

    public DayCategoryList generate(final DayCategoryList dayCategoryList, final CoachList coachList) {
        IntStream.range(MIN_INDEX, MAX_INDEX).forEach(i -> addOneDayRecommend(dayCategoryList, coachList));
        return dayCategoryList;
    }

    private void addOneDayRecommend(final DayCategoryList dayCategoryList, final CoachList coachList) {
        final Category category = generateCategory(dayCategoryList);

        dayCategoryList.addCategory(category);
        coachList.getAllCoaches().forEach(coach -> recommendMenu(coach, category));
    }

    private Menu recommendMenu(final Coach coach, final Category category) {
        final List<String> menus = coach.getAvailMenuByCategory(category);
        while (true) {
            final String menu = Randoms.shuffle(menus).get(0);
            if (coach.noSameRecommendMenu(menu)) {
                final Menu recommendMenu = new Menu(menu);
                coach.addRecommendMenu(recommendMenu);
                return recommendMenu;
            }
        }
    }

    private Category generateCategory(final DayCategoryList dayCategoryList) {
        while (true) {
            final Category category = Category.getByIndex(Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE));
            if (dayCategoryList.isMaxCount(category)) {
                continue;
            }
            return category;
        }
    }
}
