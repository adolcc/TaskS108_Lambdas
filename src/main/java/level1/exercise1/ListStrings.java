package level1.exercise1;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

public class ListStrings {

    private final List<String> instruments = new ArrayList<>();

    public ListStrings() {
        instruments.add("Guitar");
        instruments.add("Piano");
        instruments.add("Drums");
        instruments.add("Violin");
        instruments.add("Flute");
        instruments.add("Saxophone");
        instruments.add("Double bass");
        instruments.add("Trumpet");
    }

    public List<String> filterInstrumentsContainingO() {
        return instruments.stream()
                .filter(instrument -> instrument.toLowerCase()
                        .contains("o"))
                .collect(Collectors.toList());

    }

}

