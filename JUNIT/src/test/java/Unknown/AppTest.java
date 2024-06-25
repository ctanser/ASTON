package Unknown;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    @DisplayName("Калькулятор")
    @Test
    public void testSubtraction() {
        assertAll("numbers",
                () -> assertEquals(5, Calc.summ(2, 3)),
                () -> assertEquals(2, Calc.substraction(5, 3)),
                () -> assertEquals(6, Calc.multiplication(2, 3)),
                () -> assertEquals(2, Calc.division(6, 3))
        );

    }

    @DisplayName("Факториал")
    @Test
    public void testFactorial() {
       assertEquals(6,FactorialCalculator.getFactorial(3));
    }

    @DisplayName("Сравнение")
    @Test
    public void testCompare() {
        assertTrue(CompareNumbers.compareNumbers(3,3));
    }
}
