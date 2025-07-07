package level1.exercise1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListStrings searchingO = new ListStrings();

        List<String> instrumentsWithO = searchingO.filterInstrumentsContainingO();

        System.out.println("Instruments with 'o': " + instrumentsWithO);

    }

}

