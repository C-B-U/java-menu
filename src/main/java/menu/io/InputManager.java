package menu.io;

import menu.collection.CoachList;
import menu.collection.CoachMenuList;

import java.util.Arrays;
import java.util.function.Supplier;

public class InputManager {
    private static final String SPLITTER = ",";
    private final InputView inputView;

    public InputManager(final InputView inputView) {
        this.inputView = inputView;
    }

    public CoachList readCoach() {
        return read(() -> new CoachList(Arrays.asList(inputView.readCoach().split(SPLITTER))));
    }

    public CoachMenuList readCoachMenu() {
        return read(() -> new CoachMenuList(Arrays.asList(inputView.readCoachMenu().split(SPLITTER))));
    }

    private <T> T read(final Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (final IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
