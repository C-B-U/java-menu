package menu;

import menu.constants.Menus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
public class MenusTest {

    @Test
    @DisplayName("타입에 맞는 음식 종류들을 찾을 수 있다.")
    void findMenusByType(){
        List<String> menus = Menus.findFoods("일식");
        assertThat(menus).isEqualTo(List.of("규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노미야끼"));
    }

}
