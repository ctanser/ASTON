package Unknown;

public class Calc {
    public static void main( String[] args )
    {
        System.out.println(Calc.summ(2,2));
        System.out.println(Calc.substraction(2,2));
        System.out.println(Calc.multiplication(2,2));
        System.out.println(Calc.division(2,2));

    }

    public static int summ(int a, int b)
    {
        return a + b;
    }

    public static int substraction(int a, int b)
    {
        return a - b;
    }

    public static int multiplication(int a, int b)
    {
        return a * b;
    }

    public static int division(int a, int b)
    {
        return a / b;
    }
}
