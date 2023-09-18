package menu.utils;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.MenuCategory;
import menu.domain.*;

import java.util.List;

public class MenuRecommender {

    private static final int MIN_CATEGORY_INDEX = 1;
    private static final int MAX_CATEGORY_INDEX = 5;
    private static final int RECOMMEND_INDEX = 0;

    public RecommendResult recommendMenus(final Coaches coaches) {
        final MenuCategories menuCategories = new MenuCategories();
        recommendAllDay(coaches, menuCategories);
        return new RecommendResult(coaches, menuCategories);
    }

    private void recommendAllDay(final Coaches coaches, final MenuCategories menuCategories) {
        while (menuCategories.needNext()) {
            final MenuCategory menuCategory = generateRandomCategory();
            if (!menuCategories.hasMaxNum(menuCategory)) {
                menuCategories.addMenuCategory(menuCategory);
                recommendAllCoaches(coaches, menuCategory);
            }
        }
    }

    private void recommendAllCoaches(final Coaches  coaches, final MenuCategory menuCategory) {
        while(!coaches.isLast()) {
            final Coach coach = coaches.getNextCoach();
            final HateMenus hateMenus = coach.getHateMenus();
            final List<String> menus = menuCategory.getMenusFiltered(hateMenus);
            final String recommendedMenu = getRecommendedMenu(menus, coach.getRecommendedMenus());
            coach.updateRecommendedMenus(recommendedMenu);
        }
    }

    private String getRecommendedMenu(final List<String> menus, final List<String> recommended) {
        while (true) {
            final String menu = Randoms.shuffle(menus).get(RECOMMEND_INDEX);
            if (!recommended.contains(menu)) {
                return menu;
            }
        }
    }

    private MenuCategory generateRandomCategory() {
        return MenuCategory.getByIndex(Randoms.pickNumberInRange(MIN_CATEGORY_INDEX, MAX_CATEGORY_INDEX));
    }
}
