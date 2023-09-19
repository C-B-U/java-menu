package menu;

import menu.constants.Days;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
class DaysTest {

    @Test
    @DisplayName("요일에 맞게 출력하는지 확인한다.")
    void showDivisionDays(){
        String days = Days.showDivisionDays();
        assertThat(days).isEqualTo("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]");
    }
}
