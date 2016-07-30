import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by tin on 7/30/16.
 */
public class MatrixLayoutRotationTest {
    @Test
    public void convert() throws Exception {
        List<LinkedList<Integer>> linkedLists = new ArrayList<>();
        LinkedList<Integer> e = new LinkedList<>();
        e.addAll(Arrays.asList(1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6));
        linkedLists.add(e);
        e = new LinkedList<>();
        e.addAll(Arrays.asList(7, 8, 9, 14, 13, 12));
        linkedLists.add(e);
        int[][] array = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
        };
        final int[][] ints = MatrixLayoutRotation.convert(linkedLists, 4, 5);
        for (int i = 0; i < ints.length; i++) {
            assertArrayEquals(array[i], ints[i]);
        }
    }

    @Test
    public void testConvert() throws Exception {

        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };

        final List<LinkedList<Integer>> linkedLists = MatrixLayoutRotation.convert(array);

        assertEquals(1, linkedLists.size());
        LinkedList<Integer> integers = linkedLists.get(0);
        assertEquals(6, integers.size());

        int[] ints = new int[6];
        for (int i = 0; i < integers.size(); i++) {
            ints[i] = integers.get(i);
        }


        assertArrayEquals(
                new int[]{1, 2, 3, 6, 5, 4},
                ints
        );
    }

    @Test
    public void testConvertBig() throws Exception {

        int[][] array = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},

        };

        final List<LinkedList<Integer>> linkedLists = MatrixLayoutRotation.convert(array);

        assertEquals(2, linkedLists.size());


        LinkedList<Integer> integers = linkedLists.get(0);
        assertEquals(14, integers.size());
        int[] ints = new int[14];
        for (int i = 0; i < integers.size(); i++) {
            ints[i] = integers.get(i);
        }


        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6},
                ints
        );

        integers = linkedLists.get(1);
        assertEquals(6, integers.size());

        ints = new int[6];
        for (int i = 0; i < integers.size(); i++) {
            ints[i] = integers.get(i);
        }


        assertArrayEquals(
                new int[]{7, 8, 9, 14, 13, 12},
                ints
        );

    }
}