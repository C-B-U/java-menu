package menu;

import menu.model.RecommendCategory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

class CategoryTest {

    RecommendCategory recommendCategory = new RecommendCategory();

    @Test
    @DisplayName("추천 카테고리가 카테고리 수 만큼 저장이 되는지 확인한다.")
    void checkSaveRecommendCategories(){
        //given
        recommendCategory.createRecommendCategory();

        //when
        List<String> categories = recommendCategory.getCategories();

        //then
        assertThat(categories.size()).isEqualTo(5);
    }
}
