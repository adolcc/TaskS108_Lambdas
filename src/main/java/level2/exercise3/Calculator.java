package level2.exercise3;

public class Calculator {

    @FunctionalInterface
    public interface Operation {
        float operate(float a, float b);
    }

    public float calculate(Operation operation, float a, float b) {
        return operation.operate(a, b);
    }
}
