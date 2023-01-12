package pl.comarch.it.akademia.testy;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    public CalculatorTest() {
        System.out.println("Konstruktor !!!");
    }

    @Test
    public void addTest() {
        int a = 5;
        int b = 7;
        int expectedResult = 12;

        int actual = calculator.add(a,b);

        Assert.assertEquals(expectedResult, actual);
    }

    @Test
    public void divideTwoPositivesTest() {
        int a = 7;
        int b = 2;
        double expectedResult = 3.5;

        double actual = calculator.divide(a,b);

        Assert.assertEquals(expectedResult, actual, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroTest() {
        int a = 7;
        int b = 0;

        System.out.println(calculator.divide(a,b));
    }

    @Test
    public void test1() {

    }

    @Test
    public void test2() {

    }

    @Test
    public void test3() {

    }
}
