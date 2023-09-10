package menu.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Coaches {

    private final List<Coach> coaches;

    public Coaches(Names names) {
        this.coaches = names.getElements()
                .stream()
                .map(Coach::new)
                .collect(Collectors.toList());
    }
}