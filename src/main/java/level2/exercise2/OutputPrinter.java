package level2.exercise2;

import java.util.List;

public class OutputPrinter {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printList(String title, List<?> items) {
        System.out.println(title);
        if (items == null || items.isEmpty()) {
            System.out.println("No items to display.");
        } else {
            for (Object item : items) {
                System.out.println(item);
            }
        }
    }
}
