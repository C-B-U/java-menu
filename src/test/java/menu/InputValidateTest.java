package menu;

import menu.view.validate.InputValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class InputValidateTest {

    private static final String errorMessage = "[ERROR]";
    InputValidator inputValidator = new InputValidator();

    @Test
    @DisplayName("코치 이름이 ','로 구분되어 입력 받지 못하면 에러가 발생한다.")
    void validateSplitComma(){
        assertThatThrownBy(() -> inputValidator.validateCommaContain("토미/제임스/포코"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(errorMessage);

    }

    @Test
    @DisplayName("못 먹는 메뉴의 개수가 최소 0개, 최대 2개가 아니면 에러가 발생한다.")
    void validateForbiddenMenuCount(){
        assertThatThrownBy(() -> inputValidator.validateForbiddenMenuCount("우동,스시,비빔밥"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(errorMessage);
    }
}
