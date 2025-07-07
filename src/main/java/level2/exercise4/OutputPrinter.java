package level2.exercise4;


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
            items.forEach(System.out::println);
        }
    }
}