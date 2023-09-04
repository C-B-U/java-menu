package menu.domain;

import menu.constant.Category;
import menu.constant.Day;
import menu.constant.ResultTag;

import java.util.*;
import java.util.stream.Collectors;

public class DayCategoryList {
    private static final String CATEGORY_TAG = "카테고리";
    private final List<DayCategory> dayCategoryList;

    public DayCategoryList() {
        this.dayCategoryList = new ArrayList<>();
    }

    public boolean isMaxCount(final Category category) {
        return dayCategoryList.stream().filter(d -> d.getCategory() == category).count() == 2;
    }

    public void addCategory(final Category category) {
        final DayCategory dayCategory = new DayCategory(Day.getByOrder(dayCategoryList.size()), category);
        dayCategoryList.add(dayCategory);
    }

    @Override
    public String toString() {
        return ResultTag.START_TAG
                + CATEGORY_TAG
                + ResultTag.DELIMITER
                + dayCategoryList.stream().map(DayCategory::toString).collect(Collectors.joining(ResultTag.DELIMITER.toString()))
                + ResultTag.END_TAG;
    }
}
