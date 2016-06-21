import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by tin on 4/30/16.
 */
public class TimeConversionTest {


    @Test
    public void testGetTimeIn24() throws Exception {
        assertEquals("13:00:00", TimeConversion.getTimeIn24(new Scanner("01:00:00PM")));
        assertEquals("00:00:00", TimeConversion.getTimeIn24(new Scanner("12:00:00AM")));
        assertEquals("12:00:00", TimeConversion.getTimeIn24(new Scanner("12:00:00PM")));
    }
}