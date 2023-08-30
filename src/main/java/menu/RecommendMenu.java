package menu;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class RecommendMenu {

    private final Map<String, List<String>> menus = new HashMap<>();

    public void recommendMenu(CoachNames coachNames, ForbiddenMenu forbiddenMenu, RecommendCategory recommendCategory){
        for (String coach : coachNames.getCoachNames()){
            addMenu(forbiddenMenu, recommendCategory, coach);
        }
    }

    private void addMenu(ForbiddenMenu forbiddenMenu, RecommendCategory recommendCategory, String coach) {
        List<String> categories = recommendCategory.getCategories();
        int next = 0;
        while (isRecommendsMenu(coach, recommendCategory)){
            List<String> menu = Menus.getFoods(categories.get(next++));
            String menuName = Randoms.shuffle(menu).get(0);
            if (canAddMenu(coach, menuName, forbiddenMenu)){
                List<String> coachMenus = menus.getOrDefault(coach, new ArrayList<>());
                coachMenus.add(menuName);
                menus.put(coach, coachMenus);
            }
        }
    }

    private boolean isRecommendsMenu(String coach, RecommendCategory recommendCategory) {
        List<String> coachMenus = menus.getOrDefault(coach, Collections.emptyList());
        return coachMenus.size() < recommendCategory.getCategoryCount();
    }

    private boolean canAddMenu(String coach, String menuName, ForbiddenMenu forbiddenMenu) {
        boolean isNotDuplicate = menus.getOrDefault(coach, Collections.emptyList())
                .stream()
                .noneMatch(menu -> menu.equals(menuName));
        boolean isNotContainForbiddenMenu = forbiddenMenu.isNotContainForbiddenMenu(coach, menuName);
        return isNotDuplicate && isNotContainForbiddenMenu;
    }

    public Map<String, List<String>> getMenus() {
        return menus;
    }
}
