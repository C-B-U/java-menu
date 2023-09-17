package menu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CoachesTest {

    private static final String error = "[ERROR] ";

    @Test
    @DisplayName("코치의 수가 2~5명 사이가 아니라면 에러가 발생한다.")
    void validateCoachNumbers(){
        assertThatThrownBy(() -> new Coaches("토미"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(error);
    }
}
