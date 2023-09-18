package menu.domain;

import menu.constant.ErrorMessage;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Coach {

    private static final int MIN_NAME_LENGTH = 2;
    private static final int MAX_NAME_LENGTH = 4;
    private final String name;
    private HateMenus hateMenus;
    private RecommendedMenus recommendedMenus;

    public Coach(final String name) {
        validateName(name);
        this.name = name;
        this.recommendedMenus = new RecommendedMenus();
    }

    private void validateName(final String name) {
        final int length = name.length();
        if (MIN_NAME_LENGTH > length || length > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_COACH_NAME_LENGTH.getMessage());
        }
    }

    public String getName() {
        return this.name;
    }

    public boolean hasName(final String coachName) {
        return this.name.equals(coachName);
    }

    public void updateHateMenus(final HateMenus hateMenus) {
        this.hateMenus = hateMenus;
    }

    public HateMenus getHateMenus() {
        return this.hateMenus;
    }

    public void updateRecommendedMenus(final String menus) {
        this.recommendedMenus.addMenu(menus);
    }

    public List<String> getRecommendedMenus() {
        return this.recommendedMenus.getMenus().stream()
                .map(Menu::getName)
                .collect(Collectors.toList());
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Coach coach = (Coach) o;
        return Objects.equals(name, coach.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
