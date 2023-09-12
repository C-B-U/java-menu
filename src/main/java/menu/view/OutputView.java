package menu.view;

import menu.constant.Days;
import menu.constant.OutputMessage;
import menu.constant.ResultElement;
import menu.domain.Categories;
import menu.domain.Coaches;

import java.util.Arrays;
import java.util.StringJoiner;

public class OutputView {

    public void printStart() {
        System.out.println(OutputMessage.START_RECOMMEND.getMessage());
        printNewLine();
    }

    public void printCoachNames() {
        System.out.println(OutputMessage.READ_NAMES.getMessage());
    }

    public void printNewLine() {
        System.out.println();
    }

    public void printExcludedMenu(String name) {
        System.out.printf(OutputMessage.READ_EXCLUDED_MENU.getMessage(), name);
        printNewLine();
    }

    public void printRecommendResult(Categories categories, Coaches coaches) {
        printResultMessage();
        printDays();
        printCategories(categories);
        printCoaches(coaches);
        printCompleteMessage();
    }

    private void printResultMessage() {
        System.out.println(OutputMessage.RECOMMEND_RESULT.getMessage());
    }

    private void printDays() {
        StringJoiner stringJoiner = new StringJoiner(ResultElement.DELIMITER.toString(), ResultElement.START.toString(), ResultElement.END.toString());
        stringJoiner.add(OutputMessage.DAYS.getMessage());
        Arrays.stream(Days.values())
                .forEach((day) -> stringJoiner.add(day.toString()));
        System.out.println(stringJoiner);
    }

    private void printCategories(Categories categories) {
        System.out.println(categories.getCategories());
    }

    private void printCoaches(Coaches coaches) {
        System.out.println(coaches.getRecommend());
    }

    private void printCompleteMessage() {
        System.out.println(OutputMessage.COMPLETE_RECOMMEND.getMessage());
    }

    public void printExceptionMessage(String message) {
        System.out.println(message);
    }
}
