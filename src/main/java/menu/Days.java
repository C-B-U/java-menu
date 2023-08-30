package menu;

public enum Days {
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일");

    private static final String DIVISION = "구분";
    private final String value;

    Days(String value) {
        this.value = value;
    }

    public static String outputDays() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(OutputElement.FIRST_ELEMENT).append(DIVISION);
        for (Days days :Days.values()){
            stringBuilder.append(OutputElement.MIDDLE_ELEMENT)
                    .append(days.value);
        }
        stringBuilder.append(OutputElement.LAST_ELEMENT);
        return stringBuilder.toString();
    }
}
