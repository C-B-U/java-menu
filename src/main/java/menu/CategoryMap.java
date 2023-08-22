package menu;

import java.util.Collections;
import java.util.LinkedList;

public class CategoryMap {
    private static final String CATEGORY_PREFIX = "카테고리";
    private static final int FIRST_INDEX = 0;
    private final LinkedList<String> map = new LinkedList<>();


    public void add(String type) {
        map.add(type);
    }

    public int getSize() {
        return map.size();
    }

    public boolean isDuplicateMoreThanTwice(Category category) {
        int count = Collections.frequency(map, category.getType());
        return count == 2;
    }

    public String draw() {
        map.add(FIRST_INDEX, CATEGORY_PREFIX);
        return join();
    }

    private String join() {
        return MapElement.OPEN_BRACKET.get()
                + String.join(MapElement.DELIMITER.get(), map)
                + MapElement.CLOSE_BRACKET.get()
                + MapElement.NEW_LINE.get();
    }
}
