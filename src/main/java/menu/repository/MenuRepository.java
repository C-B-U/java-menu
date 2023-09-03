package menu.repository;

import menu.domain.CoachList;

public class MenuRepository {
    private CoachList coachList;

    public CoachList saveCoachList(final CoachList coachList) {
        this.coachList = coachList;
        return this.coachList;
    }

    public CoachList findCoachList() {
        return this.coachList;
    }
}
