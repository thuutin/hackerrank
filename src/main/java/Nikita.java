import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by tin on 7/28/16.
 */
public class Nikita {

    // solution to this problem: https://www.hackerrank.com/challenges/array-splitting

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int testcases = scanner.nextInt();
        for (int i = 0; i < testcases; i++) {

            final int length = scanner.nextInt();

            int[] array = new int[length];
            int sum = 0;
            for (int i1 = 0; i1 < length; i1++) {
                array[i1] = scanner.nextInt();
                sum += array[i1];
            }
            ints.clear();
            System.out.println(solve(array, sum, 0, array.length));
        }
    }

    static Map<Integer, Map<Integer, Integer>> ints = new HashMap<>();

    public static int solve(int[] array, int sum, int start, int end) {
//        System.out.println(String.valueOf(start) + "    " + String.valueOf(end));
        if (ints.containsKey(start) && ints.get(start).containsKey(end)) {
            return ints.get(start).get(end);
        }
        if (sum == 0) {
            return save(start, end, end - start -1);
        }
        if (sum % 2 == 1) {
            return save(start, end, 0);
        }

        if (end - start < 2) {
            return save(start, end, 0);
        }
        if (end - start == 2) {
            if (array[start] == array[start + 1]) {
                return save(start, end, 1);
            }
            return save(start, end, 0);
        }
        int i = start;
        int sumFromLeft = array[i];
        int sumFromRight = sum - array[i];

        int found = 0;

        while (i < end - 1) {
            if (sumFromLeft == sumFromRight) {
                final int left = solve(array, sumFromLeft, start, i + 1);
                final int right = solve(array, sumFromRight, i + 1, end);
                final int f = Math.max(left, right) + 1;
                if (found < f) {
                    found = f;
                }
            }
            do {
               i++;
            } while (i < end - 1 && array[i] == 0);

            sumFromLeft += array[i];
            sumFromRight -= array[i];
        }
        return save(start, end, found);
    }

    private static int save(int start, int end, int result) {
        if (!ints.containsKey(start)){
            ints.put(start, new HashMap<>());
        }
        ints.get(start).put(end, result);
        return result;
    }
}
