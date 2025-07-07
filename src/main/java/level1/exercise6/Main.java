package level1.exercise6;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListOrder listOrder = new ListOrder();


        List<String> listMinusMajor = listOrder.getNumString();

        listMinusMajor.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println("Order from minus to major longitude: " + listMinusMajor);

    }
}
