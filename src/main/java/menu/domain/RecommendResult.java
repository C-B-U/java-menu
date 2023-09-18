package menu.domain;

public class RecommendResult {
    private final Coaches coaches;
    private final MenuCategories menuCategories;

    public RecommendResult(final Coaches coaches, final MenuCategories menuCategories) {
        this.coaches = coaches;
        this.menuCategories = menuCategories;
    }

    public String getResult() {
        return "";
    }
}
