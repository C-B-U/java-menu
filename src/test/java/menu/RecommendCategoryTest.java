package menu;
import menu.domain.RecommendCategory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
class RecommendCategoryTest {

    @Test
    @DisplayName("카테고리가 최대 2번 중복되지 않았으면 추가되어 메뉴를 추천할 수 있다.")
    void saveCategoryReturnTrue(){
        RecommendCategory recommendCategory = new RecommendCategory();

        boolean canAdd = recommendCategory.isAddingRandomCategory();
        boolean canRecommend = recommendCategory.canRecommendCategory();

        assertThat(canAdd).isTrue();
        assertThat(canRecommend).isTrue();
    }
}
