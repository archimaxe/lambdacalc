

public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(10, 5);
        int b = calculator.minus.apply(6,2);
        int c = calculator.abs.apply(-5);
        calculator.println.accept(c);
    }
}
