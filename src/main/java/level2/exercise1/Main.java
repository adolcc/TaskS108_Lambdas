package level2.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Adolfo");
        names.add("Abelardo");
        names.add("Ada");
        names.add("Benito");
        names.add("Alfonso");
        names.add("Ariel");
        names.add("Ariana");
        names.add("Ari");
        names.add("Avi");
        names.add("Amanda");

        NameService nameService = new NameService();

        NamePrinter namePrinter = new NamePrinter();

        List<String> filteredNames = nameService.filterNames(
                names,
                (s) -> s != null && s.startsWith("A") && s.length() == 3
        );

        namePrinter.print("Names starting with 'A' and having 3 letters:", filteredNames);
    }
}
