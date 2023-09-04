package menu.domain;

import menu.constant.Category;
import menu.constant.Day;

import java.util.Objects;

public class DayCategory {
    private final Day day;
    private final Category category;

    public DayCategory(final Day day, final Category category) {
        this.day = day;
        this.category = category;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final DayCategory that = (DayCategory) o;
        return day == that.day && category == that.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, category);
    }

    @Override
    public String toString() {
        return this.category.toString();
    }

    public Category getCategory() {
        return this.category;
    }
}
