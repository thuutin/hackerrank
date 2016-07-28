import java.math.BigInteger;
import java.util.*;

/**
 * Created by tin on 7/16/16.
 */
public class Permutation {


    static int init(int n, Set<Integer> k, Set<Integer> l) {
        BigInteger result = BigInteger.ONE;
        int i = 1;
        while (i <= n) {
            int opp = 0;
            int haveConstraintsSofar = i + 1;
            int next = haveConstraintsSofar;
            while (next - haveConstraintsSofar < 2) {
                if (k.contains(next) || l.contains(next)) {
                    next += 1;
                }
            }
            solve(haveConstraintsSofar, next, k, l);
            result = result.multiply(BigInteger.valueOf(opp));
            i++;
        }
        return result.intValue();
    }

    private static void solve(int start, int end, Set<Integer> k, Set<Integer> l) {
        int n = end - start + 1;


    }

}
