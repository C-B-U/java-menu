package menu.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("못먹는 메뉴 도메인에서")
class HateMenusTest {

    @Test
    @DisplayName("생성시 리스트의 원소 개수가 5개보다 많으면 예외를 던진다.")
    void create() {
        Assertions.assertThatThrownBy(() -> new HateMenus(List.of("", "", "", "", "", "")))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
