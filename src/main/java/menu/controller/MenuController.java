package menu.controller;

import menu.collection.CoachList;
import menu.collection.CoachMenuMap;
import menu.io.InputManager;
import menu.io.OutputView;
import menu.service.MenuService;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MenuController {
    private static final int START_INDEX = 0;
    private final OutputView outputView;
    private final InputManager inputManager;
    private final MenuService menuService;

    public MenuController(final OutputView outputView, final InputManager inputManager, final MenuService menuService) {
        this.outputView = outputView;
        this.inputManager = inputManager;
        this.menuService = menuService;
    }

    public void start() {
        outputView.printStart();
        final CoachList coachList = createCoachList();
        createCoachMenuMap(coachList);
    }

    private void createCoachMenuMap(final CoachList coachList) {
        final CoachMenuMap coachMenuMap = coachMenuInput(coachList);
        menuService.saveCoachMenuMap(coachMenuMap);
    }

    private CoachMenuMap coachMenuInput(final CoachList coachList) {
        return new CoachMenuMap(IntStream.range(START_INDEX, coachList.getCoachNum())
                .mapToObj(i -> coachList.getNextCoach())
                .peek(outputView::printCoachMenuRequest)
                .collect(Collectors.toMap(Function.identity(), coach -> inputManager.readCoachMenu())));
    }

    private CoachList createCoachList() {
        outputView.printCoachNameRequest();
        final CoachList coachList = inputManager.readCoach();
        return menuService.saveCoachList(coachList);
    }
}
