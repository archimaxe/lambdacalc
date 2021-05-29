import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetsTestThis {

    @Test
    public void divideByZeroTest(){
        Calculator calculator = Calculator.instance.get();
        int expected = 0;
        int actual = calculator.devide.apply(10, 0);
        Assertions.assertEquals(expected, actual, "Проверка провалена");
    }

    @Test
    public void divideTest(){
        Calculator calculator = Calculator.instance.get();
        int expected = 3;
        int actual = calculator.devide.apply(27, 7);
        Assertions.assertEquals(expected, actual, "Проверка провалена");
    }

    @Test
    public void multiplyTest(){
        Calculator calculator = Calculator.instance.get();
        int expected = 10;
        int actual = calculator.multiply.apply(2, 5);
        Assertions.assertEquals(expected, actual, "Проверка провалена");
    }

    @Test
    public void minusTest(){
        Calculator calculator = Calculator.instance.get();
        int expected = -3;
        int actual = calculator.minus.apply(2, 5);
        Assertions.assertEquals(expected, actual, "Проверка провалена");
    }

    @Test
    public void sumTest(){
        Calculator calculator = Calculator.instance.get();
        int expected = 3;
        int actual = calculator.plus.apply(-2, 5);
        Assertions.assertEquals(expected, actual, "Проверка провалена");
    }

    @Test
    public void calcTest(){
        Calculator calculator = Calculator.instance.get();
        int expected = 3;
        int actual = calculator.plus.apply(-2, 5);
        Assertions.assertAll("assertName",
                () -> Assertions.assertEquals(expected, actual, "Проверка провалена"),
                () -> Assertions.assertNotNull(actual, "Actual = Null"));
    }
}
