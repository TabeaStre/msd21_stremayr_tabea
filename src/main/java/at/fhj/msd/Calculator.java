package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Calculator provides methods for calculating
 *
 * @author Tabea-Maria Stremayr
 *
 */
public class Calculator
{
    private static Logger logger = LogManager.getLogger();


    /**
     * <p>This method adds two double numbers</p>
     * @param number1
     *        A double number.
     * @param number2
     *        A double number.
     * @return The result of the addition is returned
     */
    public double add(double number1, double number2)
    {
        logger.debug("Parameter 1: {}, Parameter 2: {}", number1, number2);
        return number1 + number2;
    }

    /**
     * <p>This method subtracts one double number by another</p>
     * @param number1
     *        A double number.
     * @param number2
     *        A double number.
     * @return Return the result of number1 - number2.
     */
    public double minus(double number1, double number2)
    {
        logger.debug("Parameter 1: {}, Parameter 2: {}", number1, number2);
        return number1 - number2;
    }

    /**
     * <p>This method divides one double number by another</p>
     * @param number1
     *        A double number.
     * @param number2
     *        A double number.
     * @return Return the result of number1 / number2.
     *
     * @throws ArithmeticException If number2 is zero. -> Division by zero.
     */
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

    /**
     * <p>This method multiplies two double numbers</p>
     * @param number1
     *        A double number.
     * @param number2
     *        A double number.
     * @return The result from the multiplication is returned
     */
    public double multiply(double number1, double number2)
    {
        logger.debug("Parameter 1: {}, Parameter 2: {}", number1, number2);
        return number1 * number2;
    }

    /**
     * <p>This method makes a calculation of a faculty of one number. Therefore it multiplies every number from 1 to the chosen number</p>
     * <p>If the parameter is smaller than zero, the result is always zero.</p>
     * @param number A long number.
     * @return The result of the faculty is returned
     * @throws ArithmeticException If an overflow occurs while calculating the faculty.
     */
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
