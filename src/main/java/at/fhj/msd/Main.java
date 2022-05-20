package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main
{
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args)
    {
        logger.error("It is an error logger.");
        logger.info("It is a info logger.");

        Calculator calculator = new Calculator();

        calculator.add(1, 2);
        calculator.minus(1, 2);
        calculator.multiply(1, 2);
        double divisionResult = calculator.divide(1, 2);

    }
}
