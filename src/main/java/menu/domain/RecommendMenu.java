package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.Category;
import menu.constant.Menu;
import menu.constant.ResultElement;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class RecommendMenu {

    private static final int WINNING_NUMBER = 0;

    private final List<String> menus = new ArrayList<>();

    public void recommendFoods(Category category, ExcludedMenu excludedMenu) {
        menus.add(getRandomFood(category, excludedMenu));
    }

    private String getRandomFood(Category category, ExcludedMenu excludedMenu) {
        String menu = Randoms.shuffle(Menu.getFoodsByCategory(category)).get(WINNING_NUMBER);
        while (isDuplicateRecommend(menu) || excludedMenu.isExcludedMenu(menu)) {
            menu = Randoms.shuffle(Menu.getFoodsByCategory(category)).get(WINNING_NUMBER);
        }
        return menu;
    }

    private boolean isDuplicateRecommend(String food) {
        return menus.contains(food);
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(ResultElement.DELIMITER.toString());
        menus.forEach(stringJoiner::add);
        return stringJoiner.toString();
    }
}
