package menu;

import menu.constant.Menus;
import menu.model.CoachNames;
import menu.model.ForbiddenMenu;
import menu.model.RecommendCategory;
import menu.model.RecommendMenu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


class MenuTest {

    CoachNames coachNames = new CoachNames("토미,제임스,포코");
    ForbiddenMenu forbiddenMenu = new ForbiddenMenu();



    @Test
    @DisplayName("추천된 메뉴가 코치 수 만큼 저장되는지 확인한다.")
    void checkSaveRecommendMenus(){
        RecommendMenu recommendMenu = new RecommendMenu();
        RecommendCategory recommendCategory = new RecommendCategory();
        recommendCategory.createRecommendCategory();
        recommendMenu.createRecommendMenu(coachNames, forbiddenMenu, recommendCategory);

        assertThat(recommendMenu.getMenus().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("type에 맞는 음식들이 반환되는지 확인한다.")
    void checkCorrectMappingMenu(){
        List<String> menus = Menus.getFoods("일식");
        assertThat(menus).isEqualTo(List.of("규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노미야끼"));
    }
}
