package menu.utils;

import menu.domain.CoachList;
import menu.domain.DayCategoryList;
import menu.domain.HateMenuList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("MenuGenerator의")
class MenuGeneratorTest {
    private final MenuGenerator menuGenerator = new MenuGenerator();

    @Test
    @DisplayName("메뉴 생성 로직이 수행되는가")
    void generate() {
        //given
        final CoachList coachList = new CoachList(List.of("aa", "bb"));
        final String 탕수육 = "탕수육";
        coachList.getAllCoaches().forEach(c -> c.addHateMenus(new HateMenuList(List.of(탕수육))));

        //when
        final DayCategoryList dayCategoryList = menuGenerator.generate(coachList);

        //then
        assertThat(dayCategoryList.toString()).doesNotContain(탕수육);
    }
}
