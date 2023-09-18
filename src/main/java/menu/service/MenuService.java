package menu.service;

import menu.domain.Coaches;
import menu.repository.MenuRepository;

public class MenuService {

    private final MenuRepository menuRepository = new MenuRepository();

    public void saveCoaches(final Coaches coaches) {
        menuRepository.saveCoaches(coaches);
    }
}
