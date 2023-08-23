package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class Coaches {

    private final List<Coach> coaches = new ArrayList<>();

    public void addCoach(String name, List<String> excludedFoods) {
        coaches.add(new Coach(name, excludedFoods));
    }
}