package menu.service;

import menu.domain.*;
import menu.domain.RecommendResult;
import menu.repository.MenuRepository;
import menu.utils.MenuGenerator;

public class MenuService {
    private final MenuRepository menuRepository;
    private final MenuGenerator menuGenerator;

    public MenuService(final MenuRepository menuRepository, final MenuGenerator menuGenerator) {
        this.menuRepository = menuRepository;
        this.menuGenerator = menuGenerator;
    }

    public RecommendResult recommendMenu() {
        final CoachList coachList = menuRepository.findCoachList();
        final DayCategoryList dayCategoryList = menuGenerator.generate(new DayCategoryList(), coachList);
        return new RecommendResult(coachList, dayCategoryList);
    }

    public CoachList saveCoachList(final CoachList coachList) {
        return menuRepository.saveCoachList(coachList);
    }

    public void addHateMenus(final Coach coach, final HateMenuList hateMenuList) {
        coach.addMenus(hateMenuList);
    }
}
