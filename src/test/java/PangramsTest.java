import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tin on 5/23/16.
 */
public class PangramsTest {

    @Test
    public void testIsPangrams() throws Exception {
        final String test = "We promptly judged antique ivory buckles for the next prize";
        assertEquals(true, Pangrams.isPangrams(test));
    }
}