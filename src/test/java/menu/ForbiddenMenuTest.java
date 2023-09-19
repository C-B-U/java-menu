package menu;
import menu.domain.ForbiddenMenu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
class ForbiddenMenuTest {
    ForbiddenMenu forbiddenMenu = new ForbiddenMenu();
    @Test
    @DisplayName("못 먹는 음식을 저장하고 추천 음식이 포함되지 않으면 true를 반환한다.")
    void saveForbiddenMenuAndCheckDuplicate(){
        forbiddenMenu.addForbiddenMenu("우동,스시");

        boolean isNotContain = forbiddenMenu.isNotContainRecommendMenuInForbidden("비빔밥");

        assertThat(isNotContain).isTrue();
    }

}
