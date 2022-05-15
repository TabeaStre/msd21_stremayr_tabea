package at.fhj.msd;

public class Calculator
{
    public double add(double number1, double number2)
    {
        return number1 + number2;
    }

    public double minus(double number1, double number2)
    {
        return number1 - number2;
    }

    public double divide(double number1, double number2)
    {
        return number1 / number2;
    }

    public double multiply(double number1, double number2)
    {
        return number1 * number2;
    }

    public long faculty(long number)
    {
        if (number < 0)
        {
            return 0;
        }

        long result = 1;
        for (int i = 1; i <= number; i++)
        {
            result = result * i;
            if (result < 0)
            {
                throw new ArithmeticException("Calculation Overflow");
            }
        }
        return result;
    }
}
