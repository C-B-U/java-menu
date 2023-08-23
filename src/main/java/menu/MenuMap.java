package menu;

import java.util.*;

public class MenuMap {
    private final LinkedHashMap<String, List<String>> map = new LinkedHashMap<>();
    private static final int FIRST_INDEX = 0;
    private String recommendMap = "";

    public MenuMap (List<Coach> information) {
        information.forEach(info -> map.put(info.getName(), new ArrayList<>()));
    }

    public void add(String name, String recommend) {
        map.get(name).add(recommend);
    }

    public boolean isDuplicate(String name, String recommend) {
        return map.get(name).contains(recommend);
    }

    public String getMenuMap() {
        map.forEach((name, menus) -> {
            menus.add(FIRST_INDEX, name);
            recommendMap += join(menus);
        });
        return recommendMap;
    }

    private String join(List<String> element) {
        return MapElement.OPEN_BRACKET.get()
                + String.join(MapElement.DELIMITER.get(), element)
                + MapElement.CLOSE_BRACKET.get()
                + MapElement.NEW_LINE.get();
    }
}
