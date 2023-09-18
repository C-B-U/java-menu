package menu.service;

import menu.domain.Coach;
import menu.domain.Coaches;
import menu.domain.HateMenus;
import menu.repository.MenuRepository;

public class MenuService {

    private final MenuRepository menuRepository = new MenuRepository();

    public Coaches saveCoaches(final Coaches coaches) {
        return menuRepository.saveCoaches(coaches);
    }

    public void updateHateMenus(final String coachName, final HateMenus hateMenus) {
        final Coach coach = menuRepository.findCoaches().findByName(coachName);
        coach.updateHateMenus(hateMenus);
    }
}
