package level2.exercise2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> inputNumbers = Arrays.asList(3, 55, 44, 1, 2, 85, 9);

        NumberProcessor numberProcessor = new NumberProcessor();

        OutputPrinter outputPrinter = new OutputPrinter();

        String resultString = numberProcessor.processNumbers(inputNumbers);

        outputPrinter.printMessage("Processed numbers string: " + resultString);

    }
}
