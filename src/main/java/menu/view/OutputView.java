package menu.view;

import menu.constant.Days;
import menu.constant.OutputMessage;
import menu.constant.ResultElement;
import menu.domain.Categories;
import menu.domain.Coaches;
import menu.domain.Name;

import java.util.Arrays;
import java.util.StringJoiner;

public class OutputView {

    public void printStartMessage() {
        System.out.println(OutputMessage.START_MESSAGE);
        printNewLine();
    }

    public void printNameMessage() {
        System.out.println(OutputMessage.COACH_NAME);
    }

    public void printExcludedFood(Name name) {
        System.out.printf(OutputMessage.EXCLUDED_FOOD.toString(), name);

    }

    public void printResult(Categories categories, Coaches coaches) {
        printMenuResultMessage();
        printDays();
        printCategory(categories);
        printRecommendResult(coaches);
        printComplete();
    }

    private void printMenuResultMessage() {
        System.out.println(OutputMessage.MENU_RESULT);
    }

    private void printDays() {
        StringJoiner stringJoiner = new StringJoiner(ResultElement.DELIMITER.toString(), ResultElement.START.toString(), ResultElement.END.toString());
        stringJoiner.add(OutputMessage.DAYS_TITLE.toString());
        Arrays.stream(Days.values())
                .forEach((day) -> stringJoiner.add(day.toString()));
        System.out.println(stringJoiner);
    }

    private void printCategory(Categories categories) {
        System.out.println(categories);
    }

    private void printRecommendResult(Coaches coaches) {
        System.out.println(coaches);
    }

    private void printComplete() {
        System.out.println(OutputMessage.COMPLETE);
    }

    public void printNewLine() {
        System.out.println();
    }

    public void printExceptionMessage(String exceptionMessage) {
        System.out.println(exceptionMessage);
    }
}
