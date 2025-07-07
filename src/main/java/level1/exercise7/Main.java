package level1.exercise7;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListMajorMinus orderList = new ListMajorMinus();

        List<String> orderInverse = orderList.getListMajorMinus();

        List<String> ListMajorMinus = orderInverse.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .toList();

        System.out.println("Order from major to minus: " + ListMajorMinus);

    }
}
