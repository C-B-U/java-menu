package menu.io;

import menu.domain.Coach;
import menu.domain.Coaches;
import menu.domain.HateMenus;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class InputManager {

    private static final String INPUT_DELIMITER = ",";
    private final InputView inputView = new InputView();

    public Coaches readCoachNames() {
        return read(() -> {
            final String input = inputView.readCoachNames();
            return new Coaches(Arrays.stream(input.split(INPUT_DELIMITER))
                    .map(Coach::new)
                    .collect(Collectors.toList()));
        });
    }

    public HateMenus readCoachHateMenu() {
        return read(() -> new HateMenus(Arrays.asList(inputView.readHateMenus().split(INPUT_DELIMITER))));
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
