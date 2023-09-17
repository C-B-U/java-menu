package menu.domain;

import menu.constants.ScreenElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CoachMenus {
    private final RecommendMenu recommendMenu;
    private final Map<Coach, List<String>> coachMenus;

    public CoachMenus() {
        this.recommendMenu = new RecommendMenu();
        this.coachMenus = new HashMap<>();
    }

    public void addCoachMenu(Coach coach, List<String> menus) {
        while (true) {
            String menu = recommendMenu.getMenu(menus);
            List<String> recommendMenus = coachMenus.getOrDefault(coach, new ArrayList<>());
            if (canRecommendMenu(coach, menu)) {
                recommendMenus.add(menu);
                coachMenus.put(coach, recommendMenus);
                break;
            }
        }
    }

    private boolean canRecommendMenu(Coach coach, String menu) {
        return coach.isNotContainRecommendMenuInForbidden(menu) && isNotDuplicateMenu(coach, menu);
    }

    private boolean isNotDuplicateMenu(Coach coach, String menu) {
        List<String> menus = coachMenus.getOrDefault(coach, new ArrayList<>());
        return !menus.contains(menu);
    }

    public String showCoachMenus() {
        return coachMenus.keySet().stream()
                .map(coach -> {
                    String menus = coachMenus.get(coach).stream()
                            .collect(Collectors.joining(ScreenElement.MIDDLE_DIVISION.getValue()));
                    return ScreenElement.FIRST_ELEMENT + coach.getName()
                            + ScreenElement.MIDDLE_DIVISION + menus + ScreenElement.LAST_ELEMENT;
                })
                .collect(Collectors.joining("\n")) + "\n";
    }
}
