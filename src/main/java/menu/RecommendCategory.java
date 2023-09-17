package menu;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class RecommendCategory {

    private static final int MIN_CATEGORY_NUM = 1;
    private static final int MAX_CATEGORY_NUM = 5;

    List<Categories> categories = new ArrayList<>();


    public void randomCategory(){
        Categories category = Categories.findCategory(Randoms.pickNumberInRange(MIN_CATEGORY_NUM, MAX_CATEGORY_NUM));
        categories.add(category);
    }
}