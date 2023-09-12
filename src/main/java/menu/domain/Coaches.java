package menu.domain;

import menu.constant.ResultElement;

import java.util.Collections;
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

    public void recommendByCategory(Category category) {
        coaches.forEach(coach -> coach.recommendMenu(category));
    }

    public List<Coach> getCoaches() {
        return Collections.unmodifiableList(coaches);
    }

    public String getRecommend() {
        StringBuilder stringBuilder = new StringBuilder();
        coaches.forEach(coach ->
                stringBuilder.append(coach.getRecommendMenu())
                        .append(ResultElement.NEW_LINE));
        return stringBuilder.toString();
    }
}
