package menu.service;

import menu.collection.CoachList;
import menu.collection.CoachMenuMap;
import menu.repository.MenuRepository;
import menu.utils.MenuGenerator;

public class MenuService {
    private final MenuRepository menuRepository;
    private final MenuGenerator menuGenerator;

    public MenuService(final MenuRepository menuRepository, final MenuGenerator menuGenerator) {
        this.menuRepository = menuRepository;
        this.menuGenerator = menuGenerator;
    }

    public CoachList saveCoachList(final CoachList coachList) {
        return menuRepository.saveCoachList(coachList);
    }

    public void saveCoachMenuMap(final CoachMenuMap coachMenuMap) {
        menuRepository.saveCoachMenuMap(coachMenuMap);
    }
}
