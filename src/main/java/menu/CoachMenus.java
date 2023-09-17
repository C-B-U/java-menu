package menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CoachMenus {
    private final RecommendMenu recommendMenu;
    private final Map<Coach, List<String>> coachMenus;

    public CoachMenus() {
        this.recommendMenu = new RecommendMenu();
        this.coachMenus = new HashMap<>();
    }

    public void addCoachMenu(Coach coach, List<String> menus){
        while (true){
            String menu = recommendMenu.getMenu(menus);
            if (canRecommendMenu(coach, menu)){
                coachMenus.put(coach, List.of(menu));
                break;
            }
        }
    }

    private boolean canRecommendMenu(Coach coach, String menu){
        return coach.isNotContainRecommendMenuInForbidden(menu) && isNotDuplicateMenu(coach, menu);
    }

    private boolean isNotDuplicateMenu(Coach coach, String menu){
        List<String> menus = coachMenus.getOrDefault(coach, new ArrayList<>());
        return !menus.contains(menu);
    }

    public String showCoachMenus(){
        StringBuilder sb = new StringBuilder();
        for (Coach coach : coachMenus.keySet()){
            sb.append(ScreenElement.FIRST_ELEMENT).append(coach.getName());
            for (String menu : coachMenus.get(coach)){
                sb.append(ScreenElement.MIDDLE_DIVISION).append(menu);
            }
            sb.append(ScreenElement.LAST_ELEMENT).append("\n");
        }
        sb.append("\n");
        return sb.toString();
    }
}
