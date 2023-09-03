package menu.repository;

import menu.domain.CoachList;

public class MenuRepository {
    private CoachList coachList;

    public void saveCoachList(final CoachList coachList) {
        this.coachList = coachList;
    }

    public CoachList findCoachList() {
        return this.coachList;
    }
}
