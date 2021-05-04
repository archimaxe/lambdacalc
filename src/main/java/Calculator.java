import java.util.function.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
//    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    private int abs (Integer x) {
        if (x>0) {
            return x;
        }
        else if (x < 0) {
            return (x * -1);
        }
        return 0;
    }
    /*
    abs использует тернарный оператор, проверяя сначала число на положительность.
    Если > 0, то возвратащает то же число х
    Если < 0, то возвращает отрицательное х
    */

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
