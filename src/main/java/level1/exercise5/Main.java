package level1.exercise5;

public class Main {
    public static void main(String[] args) {

        PiCalculator calculator = () -> 3.1415;

        double pi = calculator.getPiValue();

        System.out.println("Result: " + pi);
    }
}
