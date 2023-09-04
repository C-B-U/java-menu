package menu.io;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("InputValidator 의 검증로직에서")
class InputValidatorTest {
    private final InputValidator inputValidator = new InputValidator();

    @Test
    @DisplayName("콤마로 끝나는 입력값에 대해 예외를 던진다.")
    void validateSplitter1() {
        assertThatThrownBy(() -> inputValidator.validateCoachMenu("aa,"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("콤마로 시작하는 입력값에 대해 예외를 던진다.")
    void validateSplitter2() {
        assertThatThrownBy(() -> inputValidator.validateCoachMenu(",aa"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
