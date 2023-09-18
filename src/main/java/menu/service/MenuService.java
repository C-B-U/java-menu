package menu.service;

import menu.domain.Coaches;
import menu.repository.MenuRepository;

public class MenuService {

    private final MenuRepository menuRepository = new MenuRepository();

    public Coaches saveCoaches(final Coaches coaches) {
        return menuRepository.saveCoaches(coaches);
    }
}
