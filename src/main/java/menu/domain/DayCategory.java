package menu.domain;

import menu.constant.Category;

public class DayCategory {
    private final Category category;

    public DayCategory(final Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.category.toString();
    }

    public Category getCategory() {
        return this.category;
    }
}
