package menu.repository;

import menu.domain.Coaches;

public class MenuRepository {

    private Coaches coaches;

    public Coaches saveCoaches(final Coaches coaches) {
        this.coaches = coaches;
        return this.coaches;
    }

    public Coaches findCoaches() {
        return this.coaches;
    }
}
