package at.fhj.msd;

public class Main
{
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();

        calculator.add(1, 2);
        calculator.minus(1, 2);
        calculator.multiply(1, 2);
        double divisionResult = calculator.divide(1, 2);

        System.out.printf("1 / 2 = %f", divisionResult);
    }
}
