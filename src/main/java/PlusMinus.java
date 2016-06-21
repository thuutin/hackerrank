import java.util.Scanner;
import java.util.function.Predicate;

/**
 * Created by tin on 4/30/16.
 */
public class PlusMinus {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner("6\n" +
                "-4 3 -9 0 4 1");
        int[] array = getNumber(scanner);
        final int size = array.length;
        System.out.println(
                getFloatWithSixDecimalPlaces(
                        countOnCondition(array, i -> i > 0) / (size * 1.0f)
                )
        );
        System.out.println(
                getFloatWithSixDecimalPlaces(
                        countOnCondition(array, i -> i < 0) / (size * 1.0f)
                )
        );
        System.out.println(
                getFloatWithSixDecimalPlaces(
                        countOnCondition(array, i -> i == 0) / (size * 1.0f))
        );
    }


    static int[] getNumber(Scanner scanner) {
        final int size = scanner.nextInt();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = scanner.nextInt();
        }
        return result;
    }

    static int countOnCondition(int[] arrays, Predicate<Integer> integerPredicate) {
        int count = 0;
        for (int array : arrays) {
            if (integerPredicate.test(array)) {
                count++;
            }
        }
        return count;
    }

    static String getFloatWithSixDecimalPlaces(float f) {
        return String.format("%f", f);
    }
}
