package menu.service;

import menu.domain.*;
import menu.repository.MenuRepository;
import menu.utils.RandomMenuGenerator;

public class MenuService {

    private final MenuRepository menuRepository = new MenuRepository();
    private final RandomMenuGenerator randomMenuGenerator = new RandomMenuGenerator();

    public Coaches saveCoaches(final Coaches coaches) {
        return menuRepository.saveCoaches(coaches);
    }

    public void updateHateMenus(final String coachName, final HateMenus hateMenus) {
        final Coach coach = menuRepository.findCoaches().findByName(coachName);
        coach.updateHateMenus(hateMenus);
    }

    public RecommendResult recommendMenu() {
        final Coaches coaches = menuRepository.findCoaches();
        return randomMenuGenerator.generateMenus(coaches);
    }
}
