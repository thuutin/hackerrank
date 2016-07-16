import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tin on 7/14/16.
 */
public class BiggerIsGreaterTest {
    @Test
    public void substract() throws Exception {
        assertEquals("eg",BiggerIsGreater.substract("efg", 1));

    }

    @Test
    public void testSolve() throws Exception {
        assertEquals("ba",BiggerIsGreater.solve("ab"));
        assertEquals("no answer",BiggerIsGreater.solve("bb"));
        assertEquals("hegf",BiggerIsGreater.solve("hefg"));
        assertEquals("dhkc",BiggerIsGreater.solve("dhck"));
        assertEquals("hcdk",BiggerIsGreater.solve("dkhc"));
    }

}