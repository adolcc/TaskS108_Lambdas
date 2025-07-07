package level2.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ListProcessor {

    public List<String> sortByFirstChar(List<String> items) {
        if (items == null) {
            return new ArrayList<>();
        }
        return items.stream()
                .sorted(Comparator.comparingInt(s -> s.isEmpty() ? 0 : s.charAt(0)))
                .collect(Collectors.toList());
    }

    public List<String> sortEContainingStringsFirst(List<String> items) {
        if (items == null) {
            return new ArrayList<>();
        }
        return items.stream()
                .sorted((s1, s2) -> {
                    boolean s1HasE = s1.toLowerCase().contains("e");
                    boolean s2HasE = s2.toLowerCase().contains("e");

                    if (s1HasE && !s2HasE) {
                        return -1;
                    } else if (!s1HasE && s2HasE) {
                        return 1;
                    } else {
                        return 0;
                    }
                })
                .collect(Collectors.toList());
    }

    public List<String> replaceAWith4(List<String> items) {
        if (items == null) {
            return new ArrayList<>();
        }
        return items.stream()
                .map(s -> s.toLowerCase().contains("a") ? s.replace("a", "4") : s)
                .collect(Collectors.toList());
    }

    public List<String> getNumericStrings(List<String> items) {
        if (items == null) {
            return new ArrayList<>();
        }
        return items.stream()
                .filter(s -> {
                    if (s == null || s.isEmpty()) {
                        return false;
                    }
                    try {
                        Double.parseDouble(s);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .collect(Collectors.toList());
    }

}
