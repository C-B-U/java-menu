package menu;

import menu.constants.Categories;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
class CategoriesTest {

    @Test
    @DisplayName("숫자에 맞는 카테고리를 찾는지 확인한다.")
    void findCategoryByNumber(){
        String category = Categories.findCategory(1);
        assertThat(category).isEqualTo("일식");
    }

}
