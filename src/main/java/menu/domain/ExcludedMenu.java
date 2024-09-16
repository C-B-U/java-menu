package menu.domain;

import java.util.List;

public class ExcludedMenu {

    private final List<String> excludedMenus;


    public ExcludedMenu(List<String> excludedMenus) {
        this.excludedMenus = excludedMenus;
    }

    public boolean isExcludedMenu(String recommendMenu) {
        return excludedMenus.contains(recommendMenu);
    }
}
