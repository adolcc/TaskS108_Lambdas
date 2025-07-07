package level2.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NameService {

    public List<String> filterNames(List<String> names, Predicate<String> criterion) {
        List<String> filteredNames = new ArrayList<>();
        for (String name : names) {
            if (criterion.test(name)) {
                filteredNames.add(name);
            }
        }
        return filteredNames;
    }
}
