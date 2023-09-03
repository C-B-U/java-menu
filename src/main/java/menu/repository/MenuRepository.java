package menu.repository;

import menu.collection.CoachList;
import menu.collection.CoachMenuMap;

public class MenuRepository {
    private CoachList coachList;
    private CoachMenuMap coachMenuMap;

    public CoachList saveCoachList(final CoachList coachList) {
        this.coachList = coachList;
        return this.coachList;
    }

    public CoachList findCoachList() {
        return this.coachList;
    }

    public void saveCoachMenuMap(final CoachMenuMap coachMenuMap) {
        this.coachMenuMap = coachMenuMap;
    }

    public CoachMenuMap findCoachMenuMap() {
        return this.coachMenuMap;
    }
}
