package menu.service;

import menu.domain.Categories;
import menu.domain.Coaches;

public class MenuService {

    private final Coaches coaches;
    private final Categories categories;

    public MenuService(Coaches coaches) {
        this.coaches = coaches;
        this.categories = new Categories();
    }

    public void recommend() {
        categories.getElements()
                .forEach(coaches::recommendByCategory);
    }

    public Categories getCategories() {
        return categories;
    }

    public Coaches getCoaches() {
        return coaches;
    }
}
