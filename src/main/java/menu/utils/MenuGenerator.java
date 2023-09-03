package menu.utils;

import camp.nextstep.edu.missionutils.Randoms;
import menu.collection.MenuMap;
import menu.constant.Category;

import java.util.List;

public class MenuGenerator {
    private static final int MIN_INDEX = 1;
    private static final int MAX_INDEX = 5;

    public String generate() {
        final Category category = Category.getByIndex(Randoms.pickNumberInRange(MIN_INDEX, MAX_INDEX));
        final List<String> menuByCategory = MenuMap.getInstance().getByCategory(category);
        return Randoms.shuffle(menuByCategory).get(0);
    }
}
