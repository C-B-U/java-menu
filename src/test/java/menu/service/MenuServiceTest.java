package menu.service;

import menu.domain.*;
import menu.repository.MenuRepository;
import menu.utils.MenuGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("MenuService의")
class MenuServiceTest {
    private final MenuRepository menuRepository = new MenuRepository();
    private final MenuService menuService = new MenuService(menuRepository, new MenuGenerator());

    @Test
    @DisplayName("메뉴 추천이 수행되는가")
    void recommendMenu() {
        //given
        final CoachList coachList = menuRepository.saveCoachList(new CoachList(List.of("aa", "bb")));
        final String 짜장면 = "짜장면";
        coachList.getAllCoaches().forEach(c -> c.addHateMenus(new HateMenuList(List.of(짜장면))));

        //when
        final RecommendResult recommendResult = menuService.recommendMenu();

        //then
        assertThat(recommendResult.toString()).doesNotContain(짜장면);
    }

    @Test
    @DisplayName("코치 리스트 저장이 수행되는가")
    void saveCoachList() {
        //given

        //when
        final CoachList expected = new CoachList(List.of("aa", "bb"));
        final CoachList coachList = menuService.saveCoachList(expected);

        //then
        assertThat(coachList).isEqualTo(expected);
    }

    @Test
    @DisplayName("못먹는 음식 추가가 수행되는가")
    void addHateMenus() {
        //given
        menuRepository.saveCoachList(new CoachList(List.of("aa", "bb")));

        //when
        final Coach coach = menuRepository.findCoachList().getAllCoaches().get(0);
        menuService.addHateMenus(coach, new HateMenuList(List.of("탕수육", "짜장면")));

        //then

    }
}
