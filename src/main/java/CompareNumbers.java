public class CompareNumbers
{
    public static void main( String[] args )
    {
        compareNumbers(1,3);
    }

    public static void compareNumbers(int a, int b) {
        if (a == b) {
            System.out.println("Числа равны.");
        } else if (a > b) {
            System.out.println(a + " больше, чем " + b);
        } else {
            System.out.println(a + " больше, чем " + b);
        }
    }
}

