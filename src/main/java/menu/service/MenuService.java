package menu.service;

import menu.domain.*;
import menu.repository.MenuRepository;
import menu.utils.MenuRecommender;

public class MenuService {

    private final MenuRepository menuRepository = new MenuRepository();
    private final MenuRecommender menuRecommender = new MenuRecommender();

    public Coaches saveCoaches(final Coaches coaches) {
        return menuRepository.saveCoaches(coaches);
    }

    public void updateHateMenus(final String coachName, final HateMenus hateMenus) {
        final Coach coach = menuRepository.findCoaches().findByName(coachName);
        coach.updateHateMenus(hateMenus);
    }

    public RecommendResult recommendMenu() {
        final Coaches coaches = menuRepository.findCoaches();
        return menuRecommender.recommendMenus(coaches);
    }
}
