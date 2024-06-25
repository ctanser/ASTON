import static junit.framework.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void testAddition() {
        Calc calculator = new Calc();
        assertEquals(5, Calc.summ(2, 3));
    }

    @Test
    public void testSubtraction() {
        Calc calculator = new Calc();
        assertEquals(2, calculator.substraction(5, 3));
    }

    @Test
    public void testMultiplication() {
        Calc calculator = new Calc();
        assertEquals(15, calculator.multiplication(5, 3));
    }

    @Test
    public void testDivision() {
        Calc calculator = new Calc();
        assertEquals(2, calculator.division(6, 3));
    }
}
