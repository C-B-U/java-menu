package menu;

import menu.domain.Coach;
import menu.domain.Coaches;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class CoachesTest {

    private static final String error = "[ERROR] ";

    @Test
    @DisplayName("코치의 수가 2~5명 사이가 아니라면 에러가 발생한다.")
    void validateCoachNumbers() {
        assertThatThrownBy(() -> new Coaches("토미"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(error);
    }

    @Test
    @DisplayName("코치들이 저장이 되는지 확인한다.")
    void saveCoaches() {
        Coaches coaches = new Coaches("토미,제임스,포코");

        List<Coach> getCoach = coaches.getCoaches();

        List<String> names = getCoach.stream().map(Coach::getName).collect(Collectors.toList());
        assertThat(names).contains("토미", "제임스", "포코");
    }
}
