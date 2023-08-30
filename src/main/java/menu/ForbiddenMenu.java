package menu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForbiddenMenu {

    private final Map<String, List<String>> forbiddenMenus = new HashMap<>();

    public void add(String name, String forbiddenMenu) {
       forbiddenMenus.put(name, Arrays.stream(forbiddenMenu.split(",")).collect(Collectors.toList()));
    }

    public Map<String, List<String>> getForbiddenMenus() {
        return forbiddenMenus;
    }
}
