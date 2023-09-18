package menu.utils;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.MenuCategory;
import menu.domain.*;

import java.util.List;

public class RandomMenuGenerator {

    private static final int MIN_CATEGORY_INDEX = 1;
    private static final int MAX_CATEGORY_INDEX = 5;
    private static final int RECOMMEND_INDEX = 0;

    public RecommendResult generateMenus(final Coaches coaches) {
        final MenuCategories menuCategories = new MenuCategories();
        recommendAllDay(coaches, menuCategories);
        return new RecommendResult(coaches, menuCategories);
    }

    private void recommendAllDay(final Coaches coaches, final MenuCategories menuCategories) {
        while (menuCategories.needNext()) {
            final MenuCategory menuCategory = generateRandomCategory();
            if (!menuCategories.hasMaxNum(menuCategory)) {
                recommendAllCoaches(coaches, menuCategory, menuCategories);
            }
        }
    }

    private void recommendAllCoaches(final Coaches coaches, final MenuCategory menuCategory, final MenuCategories menuCategories) {
        while(coaches.hasNext()) {
            final Coach coach = coaches.getNextCoach();
            final HateMenus hateMenus = coach.getHateMenus();
            final List<String> menus = menuCategory.getMenusFiltered(hateMenus);
            final String recommendedMenu = getRecommendedMenu(menus);
            menuCategories.addRecommendedMenu(coach, recommendedMenu, menuCategory);
        }
    }

    private String getRecommendedMenu(final List<String> menus) {
        return Randoms.shuffle(menus).get(RECOMMEND_INDEX);
    }

    private MenuCategory generateRandomCategory() {
        return MenuCategory.getByIndex(Randoms.pickNumberInRange(MIN_CATEGORY_INDEX, MAX_CATEGORY_INDEX));
    }
}
