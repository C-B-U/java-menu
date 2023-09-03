package menu.collection;

import menu.domain.CoachMenu;

import java.util.List;
import java.util.stream.Collectors;

public class CoachMenuList {
    private static final int MIN_SIZE = 2;
    private final List<CoachMenu> coachMenus;

    public CoachMenuList(final List<String> menus) {
        validateSize(menus);
        this.coachMenus = menus.stream().map(CoachMenu::new).collect(Collectors.toList());
    }

    private void validateSize(final List<String> menus) {
        if (menus.size() > MIN_SIZE) {
            throw new IllegalArgumentException();
        }
    }
}
