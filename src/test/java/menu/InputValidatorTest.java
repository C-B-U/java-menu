package menu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class InputValidatorTest {
    private static final String error = "[ERROR] ";
    InputValidator inputValidator = new InputValidator();

    @Test
    @DisplayName("입력한 값에 ,를 포함하고 있지 않으면 에러가 발생한다.")
    void validateContainComma(){
        assertThatThrownBy(() -> inputValidator.validateContainComma("토미/제임스/포코"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(error);
    }
}
