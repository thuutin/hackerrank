import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tin on 5/24/16.
 */
public class InsertionSort1Test {

    @Test
    public void testSort() throws Exception {
        InsertionSort1.sort(new int[]{
                2, 4, 6, 8, 1

        });
    }
}