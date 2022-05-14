package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestCalculator
{
    private Calculator calc;
    @BeforeEach
    public void setup(){
        calc = new Calculator();
    }

    @Test
    public void testAdd(){
        Assertions.assertEquals(20, calc.add(15.0, 5.0));
    }

    @Test
    public void testMinus()
    {
        Assertions.assertEquals(5, calc.minus(12, 7));
    }

    @Test
    public void testDivision()
    {
        Assertions.assertEquals(3, calc.divide(6, 2));
    }

    @Test
    public void testMultiplication()
    {
        Assertions.assertEquals(18, calc.multiply(6, 3));
    }

    @Test
    public void testAdd2()
    {
        double a = 5000;
        double b = -10000;
        double expected = a + b;
        double actual = calc.add(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinus2()
    {
        double a = 3400;
        double b = 9834;
        double expected = a - b;
        double actual = calc.minus(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDivision2()
    {
        double a = 356;
        double b = 0;
        double expected = a / b;
        double actual = calc.divide(a, b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMultiplication2()
    {
        double a = 134.25;
        double b = 2500.33;
        double expected = a * b;
        double actual = calc.multiply(a, b);
        Assertions.assertEquals(expected, actual);
    }
}
