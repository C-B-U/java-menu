package menu;

import menu.domain.Categories;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CategoriesTest {

    @Test
    void recommendCategories() {
        Categories categories = new Categories();

        assertThat(categories.getCategories().size()).isEqualTo(5);
    }

    @Test
    void categoriesToString() {
        Categories categories = new Categories();

        assertThat(categories.toString()).contains("[ 카테고리 |");
    }
}
