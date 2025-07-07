package level1.exercise2;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListStrings searching0longer = new ListStrings();

        List<String> instrumentsWithOAndLonger = searching0longer.filterInstrumentsContainingOAndLongerThanFive();
        System.out.println("Instruments with 'o' and more than 5 letters: "+instrumentsWithOAndLonger);

    }

}
