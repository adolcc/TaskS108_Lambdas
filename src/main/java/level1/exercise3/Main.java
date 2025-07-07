package level1.exercise3;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Months months = new Months();

        List<String> showMonths = months.getMonthsList();

        showMonths.forEach(month -> System.out.println(month));

    }
}

