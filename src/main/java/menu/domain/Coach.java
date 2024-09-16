package menu.domain;

import menu.constant.Category;
import menu.constant.ResultElement;

import java.util.List;
import java.util.StringJoiner;

public class Coach {

    private final Name name;
    private final ExcludedMenu excludedMenu;
    private final RecommendMenu recommendMenu;

    public Coach(Name name, List<String> excludedFoods) {
        this.name = name;
        this.excludedMenu = new ExcludedMenu(excludedFoods);
        this.recommendMenu = new RecommendMenu();
    }

    public void recommendFoods(Category category) {
        recommendMenu.recommendFoods(category, excludedMenu);
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(ResultElement.DELIMITER.toString(), ResultElement.START.toString(), ResultElement.END.toString());
        stringJoiner.add(name.toString());
        stringJoiner.add(recommendMenu.toString());
        return stringJoiner.toString();
    }
}
