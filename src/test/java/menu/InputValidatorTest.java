package menu;

import menu.validator.InputValidator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputValidatorTest {

    InputValidator inputValidator = new InputValidator();
    String ERROR_MESSAGE = "[ERROR]";

    @Test
    void validateSpace() {
        String input = "토미, 제임스, 포코";
        assertThatThrownBy(() -> inputValidator.validateDelimiter(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }

    @Test
    void validateDelimiter() {
        String input = "토미| 제임스, 포코";
        assertThatThrownBy(() -> inputValidator.validateDelimiter(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }
}
