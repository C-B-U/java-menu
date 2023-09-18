package menu.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("코치 도메인에서")
class CoachTest {

    @Test
    @DisplayName("생성시 이름의 길이가 4보다 크면 예외를 던진다.")
    void createLongName() {
        Assertions.assertThatThrownBy(() -> new Coach("가나다라마"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("생성시 이름의 길이가 2보다 작으면 예외를 던진다.")
    void createShortName() {
        Assertions.assertThatThrownBy(() -> new Coach("가"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}