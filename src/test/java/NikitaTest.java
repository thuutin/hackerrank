import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tin on 7/28/16.
 */
public class NikitaTest {
    @Test
    public void name() throws Exception {
        assertEquals(0, Nikita.solve(new int[]{3,3,3}, 9, 0, 3));

        int[] ints = {2, 2, 2, 2};
        assertEquals(2, Nikita.solve(ints, sum(ints), 0, ints.length ));
        ints = new int[] {4, 1, 0, 1, 1, 0, 1};
        assertEquals(3, Nikita.solve(ints, sum(ints), 0, ints.length ));

    }

    static int sum (int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        return sum;
    }
}