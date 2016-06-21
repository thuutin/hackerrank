import java.util.Scanner;

/**
 * Created by tin on 5/24/16.
 */
public class InsertionSort1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        sort(array);
    }

    static void sort(int[] array) {
        int target = array[array.length - 1];
        // sort
        for (int i = 0; i < array.length; i++) {
            final int j = array.length - i - 1;
            if (j != 0 && target < array[j-1] ){
                array[j] =  array[j-1];
                print(array);
            } else {
                array[j] = target;
                print(array);
                break;
            }
        }
    }

    private static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
