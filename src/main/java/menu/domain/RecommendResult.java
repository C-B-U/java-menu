package menu.domain;

public class RecommendResult {
    private static final String LINE_DELIMITER = "\n";
    private final CoachList coachList;
    private final DayCategoryList dayCategoryList;

    public RecommendResult(final CoachList coachList, final DayCategoryList dayCategoryList) {
        this.coachList = coachList;
        this.dayCategoryList = dayCategoryList;
    }

    @Override
    public String toString() {
        return dayCategoryList
                + LINE_DELIMITER
                + coachList;
    }
}
