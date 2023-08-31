package menu;

import menu.constant.Categories;
import menu.model.RecommendCategory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

class CategoryTest {

    RecommendCategory recommendCategory = new RecommendCategory();

    @Test
    @DisplayName("추천 카테고리가 카테고리 수 만큼 저장이 되는지 확인한다.")
    void checkSaveRecommendCategoriesCount(){
        //given
        while (recommendCategory.isRecommending()){
            recommendCategory.createRecommendCategory();
        }

        //when
        List<String> categories = recommendCategory.getCategories();

        //then
        assertThat(categories.size()).isEqualTo(5);
    }

    @Test
    @DisplayName("추천 카테고리에 카테고리 중 일부가 저장되는지 확인한다.")
    void checkRecommendCategories(){
        //given
        recommendCategory.createRecommendCategory();

        //when
        List<String> categories = recommendCategory.getCategories();

        //then
        assertThat(categories).containsAnyOf(
                Categories.JAPANESE.findType(),
                Categories.KOREAN.findType(),
                Categories.CHINESE.findType(),
                Categories.ASIAN.findType(),
                Categories.WESTERN.findType());
    }

    @Test
    @DisplayName("숫자에 맞는 카테고리 타입이 반환되는지 확인한다.")
    void checkCorrectMappingCategoryType(){
        String type = Categories.getType(1);
        assertThat(type).isEqualTo("일식");
    }
}
