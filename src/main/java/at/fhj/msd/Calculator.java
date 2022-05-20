package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator
{
    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2)
    {
        logger.debug("Parameter 1: {}, Parameter 2: {}", number1, number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2)
    {
        logger.debug("Parameter 1: {}, Parameter 2: {}", number1, number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2)
    {
        logger.debug("Parameter 1: {}, Parameter 2: {}", number1, number2);
        if (number2 == 0)
        {
            logger.error("Division by zero");
            throw new ArithmeticException("Division by zero");
        }
        return number1 / number2;
    }

    public double multiply(double number1, double number2)
    {
        logger.debug("Parameter 1: {}, Parameter 2: {}", number1, number2);
        return number1 * number2;
    }

    public long faculty(long number)
    {
        logger.debug("Parameter: {}", number);

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
                logger.error("Calculation Overflow");
                throw new ArithmeticException("Calculation Overflow");
            }
        }
        return result;
    }
}
