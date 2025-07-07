package level2.exercise1;

import java.util.List;

public class NamePrinter {

    public void print(String title, List<String> names) {
        System.out.println(title);
        if (names.isEmpty()) {
            System.out.println("No matching names found.");
        } else {
            for (String name : names) {
                System.out.println(name);
            }
        }
    }
}
