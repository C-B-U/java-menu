package menu.domain;

import menu.constant.Category;

import java.util.ArrayList;
import java.util.List;

public class Coaches {

    private static final String NEW_LINE = "\n";
    private final List<Coach> coaches = new ArrayList<>();

    public void addCoach(Name name, List<String> excludedFoods) {
        coaches.add(new Coach(name, excludedFoods));
    }

    public void recommendMenu(Category category) {
        coaches.forEach(coach -> coach.recommendFoods(category));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        coaches.forEach(coach -> stringBuilder.append(coach.toString()).append(NEW_LINE));
        return stringBuilder.toString();
    }
}
