package menu;

import menu.model.CoachNames;
import menu.model.ForbiddenMenu;
import menu.model.RecommendCategory;
import menu.model.RecommendMenu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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
}
