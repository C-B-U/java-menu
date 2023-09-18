package menu.repository;

import menu.domain.Coaches;

public class MenuRepository {

    private Coaches coaches;

    public void saveCoaches(final Coaches coaches) {
        this.coaches = coaches;
    }
}
