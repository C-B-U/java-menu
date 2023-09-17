package menu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CoachTest {

    private static final String error = "[ERROR] ";

    @Test
    @DisplayName("코치 이름이 2~4글자가 아니면 에러가 발생한다.")
    void validateCoachNameLength(){
        assertThatThrownBy(() -> new Coach("준"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(error);
    }
}
