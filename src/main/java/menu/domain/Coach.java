package menu.domain;

import menu.constant.ResultElement;

import java.util.StringJoiner;

public class Coach {

    private final Name name;

    private final RecommendMenu recommendMenu = new RecommendMenu();

    public Coach(Name name) {
        this.name = name;
    }

    public void recommendMenu(Category category) {
        recommendMenu.recommend(category);
    }

    public String getName() {
        return name.getValue();
    }

    public String getRecommendMenu() {
        String delimiter = ResultElement.DELIMITER.toString();
        String start = ResultElement.START.toString();
        String end = ResultElement.END.toString();

        StringJoiner stringJoiner = new StringJoiner(delimiter, start, end);

        stringJoiner.add(name.getValue());
        stringJoiner.add(recommendMenu.getMenus());
        return stringJoiner.toString();
    }

    public void addExcludedMenu(ExcludedMenu excludedMenu) {
        recommendMenu.addExcludedMenu(excludedMenu);
    }
}
