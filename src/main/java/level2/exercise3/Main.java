package level2.exercise3;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        OutputPrinter printer = new OutputPrinter();

        float num1 = 100.0f;
        float num2 = 25.0f;

        Calculator.Operation addition = (a, b) -> a + b;
        float sum = calculator.calculate(addition, num1, num2);
        printer.printMessage(num1 + " + " + num2 + " = " + sum);

        Calculator.Operation subtraction = (a, b) -> a - b;
        float difference = calculator.calculate(subtraction, num1, num2);
        printer.printMessage(num1 + " - " + num2 + " = " + difference);

        Calculator.Operation multiplication = (a, b) -> a * b;
        float product = calculator.calculate(multiplication, num1, num2);
        printer.printMessage(num1 + " * " + num2 + " = " + product);

        Calculator.Operation division = (a, b) -> {
            if (b == 0) {
                printer.printMessage("Error: Division by zero is not allowed.");
                return Float.NaN; // Not a Number, to indicate an invalid result
            }
            return a / b;
        };
        float quotient = calculator.calculate(division, num1, num2);
        if (!Float.isNaN(quotient)) {
            printer.printMessage(num1 + " / " + num2 + " = " + quotient);
        }

        printer.printMessage("\nTesting division by zero:");
        float num3 = 50.0f;
        float num4 = 0.0f;
        float zeroDivisionResult = calculator.calculate(division, num3, num4);
    }
}
