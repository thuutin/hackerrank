import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by tin on 4/30/16.
 */
public class MainTest {

    int[][] expected;

    @Before
    public void setUp() throws Exception {
        expected = new int[3][3];
        expected[0][0] = 1;
        expected[0][1] = 3;
        expected[0][2] = 9;

        expected[1][0] = 3;
        expected[1][1] = 8;
        expected[1][2] = 5;

        expected[2][0] = 29;
        expected[2][1] = 9;
        expected[2][2] = 88;
    }

    @Test
    public void testAVeryBigSum() throws Exception {
        Scanner scanner = new Scanner("5\n1000000001 1000000002 1000000003 1000000004 1000000005\n");
        final long actual = Main.aVeryBigSum(scanner);
        assertEquals(5000000015L, actual);
    }

    @Test
    public void testgetCorrectMatrix() throws Exception {

        Scanner scanner = new Scanner("3\n1 3 9\n3 8 5\n29 09 88\n");


        final int[][] matrix = Main.getMatrix(scanner);
        assertEquals(3, matrix.length);
        assertEquals(3, matrix[0].length);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                assertEquals(expected[i][j], matrix[i][j]);
            }
        }
    }

    @Test
    public void testGetDiagonals() throws Exception {
        int[] diagonals = Main.getDiagonals(expected);
        assertEquals(2, diagonals.length);
        assertTrue(1 + 8 + 88 == diagonals[0]);
        assertTrue(9 + 8 + 29 == diagonals[1]);
    }
}