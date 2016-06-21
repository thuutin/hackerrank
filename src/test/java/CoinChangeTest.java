import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;

/**
 * Created by tin on 5/22/16.
 */
public class CoinChangeTest {

    @Test
    public void testGetCoinChange() throws Exception {
//        assertEquals(1, CoinChange.getCoinChange(1, new int[]{1, 2, 3}));
//        assertEquals(2, CoinChange.getCoinChange(2, new int[]{3, 2, 1}));
//        assertEquals(3, CoinChange.getCoinChange(3, new int[]{1, 2, 3}));
//        assertEquals(4, CoinChange.getCoinChange(4, new int[]{1, 2, 3}));
//
//        assertEquals(5, CoinChange.getCoinChange(10, new int[]{2, 5, 3, 6}));
//        assertEquals(1, CoinChange.getCoinChange(10, new int[]{2, 9}));
//        assertEquals(1, CoinChange.getCoinChange(3, new int[]{9, 8, 3}));
//        assertEquals(1, CoinChange.getCoinChange(11, new int[]{90, 8, 3}));
//        assertEquals(0, CoinChange.getCoinChange(31, new int[]{30, 30, 3}));
//        assertEquals(14, CoinChange.getCoinChange(10, new int[]{1, 2, 3}));
//        assertEquals(3, CoinChange.getCoinChange(10, new int[]{7, 2, 3}));
        assertEquals(0, CoinChange.getCoinChange(250, new int[]{
                41, 34, 46, 9, 37, 32, 42, 21, 7, 13, 1, 24, 3, 43, 2, 23, 8, 45, 19, 30, 29, 18, 35, 11}));
    }
}