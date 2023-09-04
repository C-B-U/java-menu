package menu.domain;

import menu.constant.Category;
import menu.constant.ErrorMessage;

import java.util.*;
import java.util.stream.Collectors;

public class MenuMap {
    private final Map<Category, List<String>> menuMap;
    private static MenuMap instance;

    private MenuMap() {
        menuMap = new HashMap<>();
        initializeMap();
    }

    public static MenuMap getInstance() {
        if (instance == null) {
            instance = new MenuMap();
        }
        return instance;
    }

    public boolean contains(final String name) {
        return this.menuMap.values().stream()
                .flatMap(Collection::stream)
                .anyMatch(name::equals);
    }

    private Category getCategoryByMenu(final Menu menu) {
        return menuMap.entrySet().stream()
                .filter(entry -> entry.getValue().contains(menu.toString()))
                .findAny()
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.CANNOT_FIND_CATEGORY.toString()));
    }

    public Map<Category, List<Menu>> getExceptHateMenus(final List<Menu> hateMenus) {
        final List<String> hateMenuString = getHateMenuString(hateMenus);

        return this.menuMap.values().stream()
                .flatMap(Collection::stream)
                .filter(menu -> !hateMenuString.contains(menu))
                .map(Menu::new)
                .collect(Collectors.groupingBy(this::getCategoryByMenu));
    }

    private List<String> getHateMenuString(final List<Menu> hateMenus) {
        return hateMenus.stream()
                .map(Menu::toString)
                .collect(Collectors.toList());
    }

    private void initializeMap() {
        menuMap.put(Category.JAPANESE_FOOD, List.of("규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노미야끼"));
        menuMap.put(Category.KOREAN_FOOD, List.of("김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이", "제육볶음"));
        menuMap.put(Category.CHINESE_FOOD, List.of("깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육", "토마토 달걀볶음", "고추잡채"));
        menuMap.put(Category.ASIAN_FOOD, List.of("팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜"));
        menuMap.put(Category.WESTERN_FOOD, List.of("라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티", "피자", "파니니"));
    }
}
