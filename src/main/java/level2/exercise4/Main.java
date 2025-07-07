package level2.exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> mixedList = new ArrayList<>(Arrays.asList(
                "caracas", "burla", "cat", "dog", "music", "123", "elena", "2.5", "room", "orange", "987"
        ));

        ListProcessor listProcessor = new ListProcessor();
        OutputPrinter printer = new OutputPrinter();

        List<String> currentList = new ArrayList<>(mixedList);

        printer.printList("Original List: ", currentList);

        System.out.println();

        currentList = listProcessor.sortByFirstChar(currentList);
        printer.printList("Sorted by First Char: ", currentList);
        System.out.println();

        currentList = new ArrayList<>(mixedList);
        currentList = listProcessor.sortEContainingStringsFirst(currentList);
        printer.printList("Strings with 'e' first:", currentList);
        System.out.println();

        currentList = new ArrayList<>(mixedList);
        currentList = listProcessor.replaceAWith4(currentList);
        printer.printList("Replaced 'a' with '4':", currentList);
        System.out.println();

        List<String> numericElements = listProcessor.getNumericStrings(mixedList);
        printer.printList("Numeric Elements:", numericElements);
    }
}
