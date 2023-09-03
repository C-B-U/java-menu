package menu;

import menu.factory.ComponentFactory;

public class Application {
    public static void main(String[] args) {
        final ComponentFactory componentFactory = new ComponentFactory();
        componentFactory.menuController().startRecommend();
    }
}
