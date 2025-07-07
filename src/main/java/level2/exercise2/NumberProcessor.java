package level2.exercise2;

import java.util.List;
import java.util.stream.Collectors;

public class NumberProcessor {
    public String processNumbers(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return "";
        }


        return numbers.stream()
                .map(number -> (number % 2 == 0 ? "e" : "o") + number)
                .collect(Collectors.joining(","));
    }
}
