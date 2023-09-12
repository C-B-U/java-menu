package menu.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NamesTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    @DisplayName("코치 수가 1이하일 경우 예외가 발생한다.")
    @Test
    void minCaochRangeException() {
        Name name = new Name("김연진");

        assertThatThrownBy(() -> new Names(List.of(name)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }

    @DisplayName("코치 수가 1이하일 경우 예외가 발생한다.")
    @Test
    void maxCaochRangeException() {
        Name name1 = new Name("김연진");
        Name name2 = new Name("토미");
        Name name3 = new Name("제임스");
        Name name4 = new Name("포크");
        Name name5 = new Name("이름");
        Name name6 = new Name("닉네임");

        List<Name> names = List.of(name1, name2, name3, name4, name5, name6);

        assertThatThrownBy(() -> new Names(names))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }
}
