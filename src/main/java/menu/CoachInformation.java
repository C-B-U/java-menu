package menu;

import java.util.ArrayList;
import java.util.List;

public class CoachInformation {
    private final List<Coach> information = new ArrayList<>();

    public void put(String name, List<String> foods) {
        information.add(new Coach(name, foods));
    }

    public List<Coach> getInformation() {
        return information;
    }
}
