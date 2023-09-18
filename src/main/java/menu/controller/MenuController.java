package menu.controller;

import menu.io.OutputView;

public class MenuController {

    private final OutputView outputView = new OutputView();

    public void run() {
        outputView.printStart();
    }
}
