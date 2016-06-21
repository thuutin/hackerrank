import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by tin on 5/28/16.
 */
public class ShortestReachTest {

    @Test
    public void testResolve() throws Exception {

    }

    @Test
    public void testGetDistance() throws Exception {
//        4 2
//        1 2
//        1 3
//        1
        Map<Integer, List<Integer>> edges = new HashMap<>();
        edges.put(1, new ArrayList<>(Arrays.asList(2,3)));
        edges.put(2, new ArrayList<>(Arrays.asList(1)));
        edges.put(2, new ArrayList<>(Arrays.asList(1)));
        final int distance = ShortestReach.getDistance(1, 2, edges, new HashMap<>());
        assertEquals(6, distance);
        assertEquals(-1, ShortestReach.getDistance(1, 4, edges, new HashMap<>()));
        assertEquals(-1, ShortestReach.getDistance(2, 3, edges, new HashMap<>()));
        assertEquals(-1, ShortestReach.getDistance(4, 1, edges, new HashMap<>()));
    }
}