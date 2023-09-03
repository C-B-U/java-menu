package menu.collection;

import menu.domain.Coach;

import java.util.Map;

public class CoachMenuMap {
    private final Map<Coach, CoachMenuList> coachMenuMap;

    public CoachMenuMap(final Map<Coach, CoachMenuList> coachMenuMap) {
        this.coachMenuMap = coachMenuMap;
    }
}
