package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.ResultElement;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class RecommendMenu {

    private static final int RECOMMEND_NUMBER = 0;

    private final List<String> menus = new ArrayList<>();
    private ExcludedMenu excludedMenu;

    public void addExcludedMenu(ExcludedMenu excludedMenu) {
        this.excludedMenu = excludedMenu;
    }

    public void recommend(Category category) {
        String menu = Randoms.shuffle(Menu.getMenuByCategory(category)).get(RECOMMEND_NUMBER);
        while (isDuplicate(menu) || isExcludedMenu(menu)) {
            menu = Randoms.shuffle(Menu.getMenuByCategory(category)).get(RECOMMEND_NUMBER);
        }
        menus.add(menu);
    }

    private boolean isDuplicate(String menu) {
        return menus.contains(menu);
    }

    private boolean isExcludedMenu(String menu) {
        return !excludedMenu.canEat(menu);
    }

    public String getMenus() {
        StringJoiner stringJoiner = new StringJoiner(ResultElement.DELIMITER.toString());

        menus.forEach(stringJoiner::add);
        return stringJoiner.toString();
    }
}
