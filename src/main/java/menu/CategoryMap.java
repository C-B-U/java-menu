package menu;

import java.util.Collections;
import java.util.LinkedList;

public class CategoryMap {
    private static final int FIRST_INDEX = 0;
    private static final int TWICE_DUPLICATE = 2;
    private static final String CATEGORY_PREFIX = "카테고리";
    private final LinkedList<String> map = new LinkedList<>();


    public void add(String type) {
        map.add(type);
    }

    public int getSize() {
        return map.size();
    }

    public boolean isDuplicateMoreThanTwice(Category category) {
        int count = Collections.frequency(map, category.getType());
        return count == TWICE_DUPLICATE;
    }

    public String getCategoryMap() {
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
