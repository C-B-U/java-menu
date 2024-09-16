package menu;

import menu.constant.Category;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CategoryTest {

    @Test
    void getJapanese() {
        Category category = Category.getRecommendFood(1);

        assertThat(category).isEqualTo(Category.JAPANESE);
    }

    @Test
    void getKorean() {
        Category category = Category.getRecommendFood(2);

        assertThat(category).isEqualTo(Category.KOREAN);
    }

    @Test
    void getChinese() {
        Category category = Category.getRecommendFood(3);

        assertThat(category).isEqualTo(Category.CHINESE);
    }

    @Test
    void getAsian() {
        Category category = Category.getRecommendFood(4);

        assertThat(category).isEqualTo(Category.ASIAN);
    }

    @Test
    void getWestern() {
        Category category = Category.getRecommendFood(5);

        assertThat(category).isEqualTo(Category.WESTERN);
    }
}
