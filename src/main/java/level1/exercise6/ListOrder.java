package level1.exercise6;

import java.util.ArrayList;
import java.util.List;

public class ListOrder {

   private final List<String> numString = new ArrayList<>();

   public ListOrder(){

       numString.add("Caracas");
       numString.add("123456789");
       numString.add("Barcelona2025");


   }

    public List<String> getNumString() {
        return numString;
    }

}
