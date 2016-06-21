import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.*;

/**
 * Created by tin on 4/30/16.
 */
public class PlusMinusTest {

    @Test
    public void testGetFloatWithSixDecimalPlaces() throws Exception {
        float f1 = 0.5f;
        String actual = PlusMinus.getFloatWithSixDecimalPlaces(f1);
        assertEquals("0.500000", actual);

        float f2 = 1 / (3f);
        actual = PlusMinus.getFloatWithSixDecimalPlaces(f2);
        assertEquals("0.333333", actual);

        float f3 = 1 / (6f);
        actual = PlusMinus.getFloatWithSixDecimalPlaces(f3);
        assertEquals("0.166667", actual);
    }

    @Test
    public void testCountOnCondition() throws Exception {
        int[] testArray = new int[] { 0, 1 ,22, 44, -2, -4, 0 , 0, -44};
        final int countPositive = PlusMinus.countOnCondition(testArray, i -> i > 0);

        assertEquals(3, countPositive);

        final int countNegative = PlusMinus.countOnCondition(testArray, i -> i < 0);
        assertTrue(countNegative == 3);

        final int countZero = PlusMinus.countOnCondition(testArray, i -> i == 0);

        assertTrue(countZero == 3);
    }
}