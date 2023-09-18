package menu.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("코치 일급컬렉션에서")
class CoachesTest {

    @Test
    @DisplayName("생성시 중복되는 코치의 이름이 있으면 예외를 던진다.")
    void create() {
        Assertions.assertThatThrownBy(() -> new Coaches(List.of(new Coach("가나다"), new Coach("가나다"))))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
