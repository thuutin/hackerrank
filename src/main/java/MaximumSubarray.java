import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by tin on 4/30/16.
 */
public class MaximumSubarray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        File f = new File("/Users/tin/Downloads/input01.txt");
        Scanner s = null;
        try {
            s = new Scanner(new FileInputStream(f));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        final int cases = s.nextInt();
        for (int i = 0; i < cases; i++) {
            final int size = s.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                final int here = s.nextInt();
                array[j] = here;
            }
            final int result = maxSumContiguousSubArray(array);
            System.out.print(result + " ");
            final int result2 = maximumNonContiguousSubArray(array);
            System.out.println(result2);
        }
    }

    static int maximumNonContiguousSubArray(int[] array) {

        int arrayLength = array.length;
     /* Current maximum sum including the current value */
        int sum1 = array[0];
     /* Current maximum sum excluding the current value */

     /* Iterate through the array from second element to the end */
        for (int i = 1; i < arrayLength; i++) {

         /* Current maximum sum excluding the current index value */

         /* Move the value of sum3 into sum2 */

         /* Current maximum sum including the current index value */
            sum1 = Math.max(Math.max(sum1, array[i]), sum1 + array[i]);
        }

     /* Return the maximum of sum1 and sum2 */
        return sum1;
    }

    static int maxSumContiguousSubArray(int[] array) {
        int maxEndingHere = array[0], maxSoFar = array[0];
        for (int i = 1; i < array.length; i++) {
            maxEndingHere = Math.max(array[i], array[i] + maxEndingHere);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }

}
