package menu.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("도메인 생성시 검증 로직 중")
class DomainValidationTest {

    @Test
    @DisplayName("코치의 이름의 길이가 2 미만인 경우 예외를 던진다.")
    void coachValidation1() {
        assertThatThrownBy(() -> new Coach("a"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("코치의 이름의 길이가 4 초과인 경우 예외를 던진다.")
    void coachValidation2() {
        assertThatThrownBy(() -> new Coach("aaaaa"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("코치가 2명 미만인 경우 예외를 던진다.")
    void coachListValidation() {
        assertThatThrownBy(() -> new CoachList(List.of("aa")))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("코치의 이름의 길이가 4 초과인 경우 예외를 던진다.")
    void hateMenuListValidation() {
        assertThatThrownBy(() -> new HateMenuList(List.of("aa", "bb", "cc")))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("정해진 이름의 메뉴가 아닌 경우 예외를 던진다.")
    void menuValidation() {
        assertThatThrownBy(() -> new Menu("aa"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
