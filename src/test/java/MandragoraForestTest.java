import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by tin on 7/28/16.
 */
public class MandragoraForestTest {
    @Test
    public void solve() throws Exception {
        int[] ints;
        ints = new int[]{3, 2, 2};
        BigInteger solve = MandragoraForest.solve(ints);
        assertEquals(10, solve.intValue());

//        ints = new int[100000];
//        for (int i = 0; i < 100000; i++) {
//            ints[i] = i;
//        }
//        solve = MandragoraForest.solve(ints);
    }

    @Test
    public void sum() throws Exception {
        int[] array = new int[16];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        long time = System.currentTimeMillis();
        BigInteger sum = MandragoraForest.sum(array, 0);
        System.out.println(System.currentTimeMillis() - time);

    }
}