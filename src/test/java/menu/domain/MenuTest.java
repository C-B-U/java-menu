package menu.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("메뉴 도메인에서")
class MenuTest {

    @Test
    @DisplayName("생성시 없는 메뉴이름으로 생성하면 예외를 던진다.")
    void create() {
        Assertions.assertThatThrownBy(() -> new Menu("가나다"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
