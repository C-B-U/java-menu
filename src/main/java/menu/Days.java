package menu;

public enum Days {
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일");

    private static final String TAG = "구분";
    private final String day;

    Days(String day) {
        this.day = day;
    }

    public static String divisionDays(){
        StringBuilder sb = new StringBuilder();
        sb.append(ScreenElement.FIRST_ELEMENT).append(TAG);
        for(Days days : Days.values()){
            sb.append(ScreenElement.MIDDLE_DIVISION).append(days.getDay());
        }
        sb.append(ScreenElement.LAST_ELEMENT);
        return sb.toString();
    }

    public String getDay() {
        return day;
    }
}
