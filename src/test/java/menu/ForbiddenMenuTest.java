package menu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.Map;

class ForbiddenMenuTest {

    ForbiddenMenu forbiddenMenu = new ForbiddenMenu();

    @Test
    @DisplayName("코치 별로 못 먹는 메뉴가 저장되는지 확인한다.")
    void checkSaveCoachForbiddenMenu(){
        //given
        forbiddenMenu.add("토미", "우동,스시");

        //when
        Map<String, List<String>> forbiddenMenus = forbiddenMenu.getForbiddenMenus();

        //then
        assertThat(forbiddenMenus)
                .containsEntry("토미", List.of("우동", "스시"));
    }
}
