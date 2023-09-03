package menu.controller;

import menu.domain.CoachList;
import menu.io.InputManager;
import menu.io.OutputView;

public class MenuController {
    private final OutputView outputView;
    private final InputManager inputManager;

    public MenuController(final OutputView outputView, final InputManager inputManager) {
        this.outputView = outputView;
        this.inputManager = inputManager;
    }

    public void start() {
        outputView.printStart();
        createCoach();
    }

    private void createCoach() {
        outputView.printCoachNameRequest();
        final CoachList coachList = inputManager.readCoach();
    }
}
