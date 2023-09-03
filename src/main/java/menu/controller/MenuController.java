package menu.controller;

import menu.io.OutputView;

public class MenuController {
    private final OutputView outputView;

    public MenuController(final OutputView outputView) {
        this.outputView = outputView;
    }

    public void start() {
        outputView.printStart();
        createCoach();
    }

    private void createCoach() {
        outputView.printCoachNameRequest();
    }
}
