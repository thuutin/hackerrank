import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.*;
/**
 * Created by tin on 4/30/16.
 */

public class FibonacciModifiedTest {

    @Test
    public void testGetFibonacci() throws Exception {
        assertTrue( new BigInteger("1").equals(FibonacciModified.getFibonacci(3, new BigInteger("0"), new BigInteger("1"))));
        assertTrue( new BigInteger("2").equals(FibonacciModified.getFibonacci(4, new BigInteger("0"), new BigInteger("1"))));
        assertTrue( new BigInteger("5").equals(FibonacciModified.getFibonacci(5, new BigInteger("0"), new BigInteger("1"))));
    }
}