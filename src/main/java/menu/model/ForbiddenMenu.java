package menu.model;

import java.util.*;
import java.util.stream.Collectors;

public class ForbiddenMenu {

    private final Map<String, List<String>> forbiddenMenus = new HashMap<>();

    public void add(String name, String forbiddenMenu) {
       forbiddenMenus.put(name, Arrays.stream(forbiddenMenu.split(",")).collect(Collectors.toList()));
    }

    public boolean isNotContainForbiddenMenu(String name, String menu){
        return forbiddenMenus
                .getOrDefault(name, new ArrayList<>())
                .stream()
                .noneMatch(forbiddenMenu -> forbiddenMenu.equals(menu));
    }

    public Map<String, List<String>> getForbiddenMenus() {
        return forbiddenMenus;
    }
}
