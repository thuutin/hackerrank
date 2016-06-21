import java.math.BigInteger;

/**
 * Created by tin on 4/30/16.
 */
public class FibonacciModified {

    static BigInteger getFibonacci(int n, BigInteger a, BigInteger b){
        if (2 == n) {
            return b;
        }

        if (1 == n){
            return a;
        }

        final BigInteger a1 = getFibonacci(n - 1, a, b);
        final BigInteger a2 = getFibonacci(n - 2, a, b);

        return a1.pow(2).add(a2);
    }
}
