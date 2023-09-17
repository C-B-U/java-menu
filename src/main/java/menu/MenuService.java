package menu;

import java.util.List;

public class MenuService {

    private final RecommendCategory recommendCategory;
    private final CoachMenus coachMenus;

    public MenuService() {
        this.recommendCategory = new RecommendCategory();
        this.coachMenus = new CoachMenus();
    }

    public void addRecommendMenu(Coaches coaches){
        if (recommendCategory.isAddingRandomCategory()){
            for (Coach coach : coaches.getCoaches()) {
                String category = recommendCategory.getDaysCategory();
                List<String> menus = Menus.findFoods(category);
                coachMenus.addCoachMenu(coach, menus);
            }
        }
    }

    public boolean isRecommending(){
        return recommendCategory.canRecommendCategory();
    }

    public String showMenuResult() {
        return recommendCategory.showRecommendCategory() +
                "\n" +
                coachMenus.showCoachMenus();
    }
}
