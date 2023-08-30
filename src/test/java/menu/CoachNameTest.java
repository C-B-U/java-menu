package menu;

import menu.model.CoachNames;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class CoachNameTest {

    private static final String errorMessage = "[ERROR]";

    @Test
    @DisplayName("',' 로 구분되어 코치 이름이 List에 저장되는지 확인한다.")
    void checkSaveCoachNames(){
        CoachNames coachNames = new CoachNames("토미,제임스,포코");

        List<String> names = coachNames.getCoachNames();

        assertThat(names).containsExactly("토미", "제임스", "포코");
    }

    @Test
    @DisplayName("코치 이름이 2~4글자 사이로 작성하지 않으면 에러가 발생한다.")
    void validateCoachNameLength(){
        assertThatThrownBy(() -> new CoachNames("토미,제임스123,포코"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(errorMessage);

    }

    @Test
    @DisplayName("코치는 최소 2명, 최대 5명으로 작성하지 않으면 에러가 발생한다.")
    void validateCoachNumber(){
        assertThatThrownBy(() -> new CoachNames("토미,제임스,포코,우테코,네이버,카카오"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(errorMessage);

    }
}
