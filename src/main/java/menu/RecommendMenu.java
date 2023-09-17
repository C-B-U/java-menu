package menu;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class RecommendMenu {

    public String getMenu(List<String> menus){
       return Randoms.shuffle(menus).get(0);
    }
}
