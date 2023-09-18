package menu.io;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("입력값 검증 중에")
class InputValidatorTest {

    private final InputValidator inputValidator = new InputValidator();

    @Test
    @DisplayName("쉼표로 시작하면 예외를 던진다.")
    void validateInputDelimiter() {
        Assertions.assertThatThrownBy(() -> inputValidator.validateInputDelimiter(",abc,ase"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("공백에 대해 예외를 던지지 않는다.")
    void validateHateMenusBlank() {
        inputValidator.validateHateMenus("");
        Assertions.assertThatNoException();
    }

    @Test
    @DisplayName("쉼표로 끝나면 예외를 던진다.")
    void validateHateMenus() {
        Assertions.assertThatThrownBy(() -> inputValidator.validateHateMenus("abc,ase,"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
