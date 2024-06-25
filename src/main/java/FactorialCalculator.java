public class FactorialCalculator {
    public static void main( String[] args )
    {
        System.out.println(getFactorial(4));
    }
    public static int getFactorial(int f) {
        if (f <= 0) {
            throw new IllegalArgumentException();
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
