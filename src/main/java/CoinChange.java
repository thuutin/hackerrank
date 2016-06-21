import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by tin on 5/22/16.
 */
public class CoinChange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        final int N = s.nextInt();
        final int M = s.nextInt();
        final int[] array = new int[M];
        for (int i = 0; i < M; i++) {
            array[i] = s.nextInt();
        }

        final BigInteger result = getCoinChange(N, array);
        System.out.println(result);
    }
    static Map<Integer, Map<Integer, BigInteger>> cache;
    static BigInteger getCoinChange(int n, int[] array) {
        cache = new HashMap<>();
        return getCoinChange(n, 0, array);
    }

    static int count = 0;

    static BigInteger getCoinChange(int n, int index, int[] array) {

        if (n <= 0) {
            return new BigInteger("0");
        }
        if (index == array.length) {
            return new BigInteger("0");
        }

        if (cache.containsKey(n) && cache.get(n).containsKey(index)){
            return cache.get(n).get(index);
        }
//        System.out.println(String.format("Compute n = %d, index = %d, count %d", n , index, count++));

        if (n > array[index]) {
            final BigInteger waysThatHasFirstElement = getCoinChange(n - array[index], index, array);
            final BigInteger waysThatDontHaveFirstElement = getCoinChange(n, index + 1, array);
            BigInteger add = waysThatDontHaveFirstElement.add(waysThatHasFirstElement);
            cacheIt(n, index, add);
            return add;
        } else {
            if (n < array[index]) {
                final BigInteger result = getCoinChange(n, index + 1, array);
                cacheIt(n, index, result);
                return result;
            } else {
                final BigInteger result = getCoinChange(n, index + 1, array).add(new BigInteger("1"));
                cacheIt(n, index, result);
                return result;
            }
        }
    }

    private static void cacheIt(int n, int index, BigInteger value) {
        if (cache.get(n) == null){
            cache.put(n, new HashMap<>());
        }
        cache.get(n).put(index, value);
    }
}
