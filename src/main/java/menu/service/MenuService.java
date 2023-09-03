package menu.service;

import menu.domain.CoachList;
import menu.repository.MenuRepository;

public class MenuService {
    private final MenuRepository menuRepository;

    public MenuService(final MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public void saveCoachList(final CoachList coachList) {
        menuRepository.saveCoachList(coachList);
    }
}
