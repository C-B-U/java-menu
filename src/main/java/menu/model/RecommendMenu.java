package menu.model;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.Menus;
import menu.constant.OutputElement;
import menu.model.CoachNames;
import menu.model.ForbiddenMenu;
import menu.model.RecommendCategory;

import java.util.*;

public class RecommendMenu {

    private final Map<String, List<String>> menus = new HashMap<>();

    public void createRecommendMenu(CoachNames coachNames, ForbiddenMenu forbiddenMenu, RecommendCategory recommendCategory){
        for (String coach : coachNames.getCoachNames()){
            addMenu(forbiddenMenu, recommendCategory, coach);
        }
    }

    private void addMenu(ForbiddenMenu forbiddenMenu, RecommendCategory recommendCategory, String coach) {
        List<String> categories = recommendCategory.getCategories();
        int next = 0;
        while (isRecommendsMenu(coach, recommendCategory)){
            List<String> menu = Menus.getFoods(categories.get(next));
            String menuName = Randoms.shuffle(menu).get(0);
            if (canAddMenu(coach, menuName, forbiddenMenu)){
                List<String> coachMenus = menus.getOrDefault(coach, new ArrayList<>());
                coachMenus.add(menuName);
                menus.put(coach, coachMenus);
                next++;
            }
        }
    }

    private boolean isRecommendsMenu(String coach, RecommendCategory recommendCategory) {
        List<String> coachMenus = menus.getOrDefault(coach, new ArrayList<>());
        return coachMenus.size() < recommendCategory.getCategoryCount();
    }

    private boolean canAddMenu(String coach, String menuName, ForbiddenMenu forbiddenMenu) {
        boolean isNotDuplicate = menus.getOrDefault(coach, new ArrayList<>())
                .stream()
                .noneMatch(menu -> menu.equals(menuName));
        boolean isNotContainForbiddenMenu = forbiddenMenu.isNotContainForbiddenMenu(coach, menuName);
        return isNotDuplicate && isNotContainForbiddenMenu;
    }

    public Map<String, List<String>> getMenus() {
        return menus;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String coach: menus.keySet()){
            stringBuilder.append(OutputElement.FIRST_ELEMENT).append(coach);

            for (String menu: menus.get(coach)){
                stringBuilder.append(OutputElement.MIDDLE_ELEMENT)
                        .append(menu);
            }
            stringBuilder.append(OutputElement.LAST_ELEMENT).append(OutputElement.NEXT_ELEMENT);
        }
        return stringBuilder.toString();
    }

}
