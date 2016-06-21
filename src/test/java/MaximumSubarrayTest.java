import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by tin on 4/30/16.
 */
public class MaximumSubarrayTest {

    @Test
    public void testMaxSumContiguousSubArray() throws Exception {
        int[] testArray = new int[]{2, -1, 2};
        int maxSumArray = MaximumSubarray.maxSumContiguousSubArray(testArray);

        assertTrue(3 ==
                maxSumArray
        );
        testArray = new int[]{2, 3, 4, -5};
        maxSumArray = MaximumSubarray.maxSumContiguousSubArray(testArray);
        assertTrue(9 ==
                maxSumArray
        );
        testArray = new int[]{2, -1, 2, 3, 4, -5
        };
        maxSumArray = MaximumSubarray.maxSumContiguousSubArray(testArray);
        assertTrue(10 ==
                maxSumArray
        );

        testArray = new int[]{2, -1, 2, -3, 7, 4, -5
        };
        maxSumArray = MaximumSubarray.maxSumContiguousSubArray(testArray);
        assertTrue(11 ==
                maxSumArray
        );

        testArray = new int[]{-2, -1, 2, 0, 7, 4, -5
        };
        maxSumArray = MaximumSubarray.maxSumContiguousSubArray(testArray);
        assertTrue(13 ==
                maxSumArray
        );

        testArray = new int[]{-2, 3, -6
        };
        maxSumArray = MaximumSubarray.maxSumContiguousSubArray(testArray);
        assertTrue(3 ==
                maxSumArray
        );
    }

    @Test
    public void testMaximumNonContiguousSubArray() throws Exception {
        int[] array = new int[] {2, -1, 2, 3, 4, -5};
        assertEquals(11, MaximumSubarray.maximumNonContiguousSubArray(array));
        array = new int[]{-2,-1, -3, -6};
        assertEquals(-1, MaximumSubarray.maximumNonContiguousSubArray(array));
    }
}