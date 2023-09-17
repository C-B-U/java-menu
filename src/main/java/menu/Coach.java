package menu;

public class Coach {

    private static final int MIN_NAME_LENGTH = 2;
    private static final int MAX_NAME_LENGTH = 4;
    private final String name;
    public final ForbiddenMenu forbiddenMenu;

    public Coach(String name) {
        validateCoachNameLength(name);
        this.name = name;
        this.forbiddenMenu = new ForbiddenMenu();
    }

    private void validateCoachNameLength(String name) {
        if (name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException(ErrorMessage.COACH_NAME_LENGTH_ERROR.getMessage());
        }
    }

    public void addForbiddenMenu(String menu){
        forbiddenMenu.addForbiddenMenu(menu);
    }

    public String getName() {
        return name;
    }
}
