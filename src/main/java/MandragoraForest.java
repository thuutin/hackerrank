import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by tin on 7/28/16.
 */
public class MandragoraForest {

    public static void main(String args[]) {
        Scanner s = null;
        try {
            s = new Scanner(new FileInputStream(new File("/Users/tin/Downloads/input01.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        final int cases = s.nextInt();
        for (int i = 0; i < cases; i++) {
            final int length = s.nextInt();
            int[] guards = new int[length];
            BigInteger sum = BigInteger.ZERO;
            for (int i1 = 0; i1 < length; i1++) {
                guards[i1] = s.nextInt();
                sum = sum.add(BigInteger.valueOf(guards[i1]));
            }
            cache.clear();
//            if (guards.length > 500) {
                System.out.println(solve(guards, sum));
//                break;
//            }
        }
    }

    static BigInteger solve(int[] guards, BigInteger sum) {
        Arrays.sort(guards);
        return solve(1, guards, 0, sum);
    }

    static Map<Integer, BigInteger> cache = new HashMap<>();

    static BigInteger solve(int s, int[] guards, int from, BigInteger sum) {
//        System.out.println(from + "  " + s);

        final BigInteger battleHere = battle(s, guards, from, sum);

        if (from == guards.length - 1) {
            return battleHere;
        }
        final BigInteger eatHere = solve(s + 1, guards, from + 1, sum.subtract(BigInteger.valueOf(guards[from])));

        BigInteger max;
        if (eatHere.compareTo(battleHere) > 0) {
            max = eatHere;
        } else {
            max = battleHere;
        }
        return max;
    }

    private static BigInteger battle(int s, int[] guards, int from, BigInteger sum) {
        BigInteger multiply = sum.multiply(BigInteger.valueOf(s));
        return multiply;
    }

    static BigInteger sum(int[] array, int from) {
//        System.out.print(from + "  ");
        if (cache.containsKey(from)) {
            System.out.print(from + " saving ");
            return cache.get(from);
        }
        if (from == array.length - 1) {
            BigInteger bigInteger = BigInteger.valueOf(array[from]);
            save(from, bigInteger);
            return bigInteger;
        }
        BigInteger sum = BigInteger.ZERO;
        for (int i = array.length - 1; i > from; i--) {
            sum = sum.add(BigInteger.valueOf(array[i]));
            save(i, sum);
        }
        return sum;
    }

    private static void save(int from, BigInteger value) {
        cache.put(from, new BigInteger(value.toString()));
    }
}
