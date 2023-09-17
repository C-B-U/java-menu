package menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static menu.InputValidator.DIVISION;

public class ForbiddenMenu {

    private final List<String> forbiddenMenus = new ArrayList<>();

    public void addForbiddenMenu(String menus){
        forbiddenMenus.addAll(Arrays.stream(menus.split(DIVISION))
                .map(String::trim)
                .collect(Collectors.toList()));
    }

    public boolean isNotContainRecommendMenuInForbidden(String menu){
        return !forbiddenMenus.contains(menu);
    }
}
