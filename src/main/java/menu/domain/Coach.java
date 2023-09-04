package menu.domain;

import menu.constant.Category;
import menu.constant.ErrorMessage;
import menu.constant.ResultTag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class Coach {
    private static final int MIN_NAME_LENGTH = 2;
    private static final int MAX_NAME_LENGTH = 4;
    private final String name;
    private final List<Menu> recommendMenuList;
    private HateMenuList hateMenuList;
    private AvailMenuList availMenuList;

    public Coach(final String name) {
        validateName(name);
        this.name = name;
        recommendMenuList = new ArrayList<>();
    }

    private void validateName(final String name) {
        final int length = name.length();
        if (invalidLength(length)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_COACH_NAME_LENGTH.toString());
        }
    }

    private boolean invalidLength(final int length) {
        return length < MIN_NAME_LENGTH || length > MAX_NAME_LENGTH;
    }

    @Override
    public String toString() {
        return ResultTag.START_TAG
                + name
                + ResultTag.DELIMITER
                + recommendMenuList.stream().map(Menu::toString).collect(Collectors.joining(ResultTag.DELIMITER.toString()))
                + ResultTag.END_TAG;
    }

    public String getName() {
        return this.name;
    }

    public void addMenus(final HateMenuList hateMenuList) {
        this.hateMenuList = hateMenuList;
        this.availMenuList = new AvailMenuList(getAvailMenu());
    }

    private Map<Category, List<Menu>> getAvailMenu() {
        return MenuMap.getInstance().getExceptHateMenus(hateMenuList.getMenus());
    }

    public List<String> getAvailMenuByCategory(final Category category) {
        return this.availMenuList.getMenuByCategory(category).stream()
                .map(Menu::toString)
                .collect(Collectors.toList());
    }

    public boolean noSameRecommendMenu(final String menu) {
        return recommendMenuList.stream().noneMatch(m -> m.toString().equals(menu));
    }

    public void addRecommendMenu(final Menu menu) {
        this.recommendMenuList.add(menu);
    }
}
