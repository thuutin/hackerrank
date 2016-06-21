import java.util.*;

/**
 * Created by tin on 5/28/16.
 */
public class ShortestReach {
    private static final int DISTANCE = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            final int nodes = scanner.nextInt();
            final int numEdges = scanner.nextInt();
            Map<Integer, List<Integer>> edges = new HashMap<>();
            for (int j = 0; j < numEdges; j++) {
                final int start = scanner.nextInt();
                final int stop = scanner.nextInt();
                addToMap(edges, start, stop);
                addToMap(edges, stop, start);
            }

            final int startNode = scanner.nextInt();

            List<Integer> distances = resolve(startNode, nodes, edges, numEdges);
            for (int i1 = 0; i1 < distances.size(); i1++) {
                int distance = distances.get(i1);
                System.out.print(distance + " ");
            }
            System.out.println();
        }
    }

    private static void addToMap(Map<Integer, List<Integer>> edges, int start, int stop) {
        if (edges.containsKey(start)) {
            edges.get(start).add(stop);
        } else {
            ArrayList<Integer> value = new ArrayList<>();
            value.add(stop);
            edges.put(start, value);
        }
    }

    private static List<Integer> resolve(int startNode, int nodes, Map<Integer, List<Integer>> edges, int numEdges) {
        List<Integer> ints = new ArrayList<>(nodes);
        for (int i = 1; i <= nodes; i++) {
            if (i != startNode){
                ints.add(getDistance(startNode, i, edges, new HashSet<>()));
            }
        }
        return ints;
    }

    static int getDistance(int startNode, int end, Map<Integer, List<Integer>> edges, Set<Integer> visited) {
        if (edges.get(startNode) == null || edges.get(startNode).size() == 0 || edges.get(end) == null || edges.get(end).size() == 0)
            return  - 1;

        List<Integer> initialNodes = new ArrayList<>(edges.get(startNode).size());
        initialNodes.addAll(edges.get(startNode));
        int distance = 6;
        int breakMark = initialNodes.size();
        int i = 0;
        while (i < initialNodes.size()) {
            if (i == breakMark){
                breakMark = initialNodes.size();
                distance += 6;
            }
            Integer key = initialNodes.get(i);
            i++;
            if (visited.contains(key)){
                continue;
            }
            visited.add(key);
            if (key == end) {
                // chot
                return distance;
            } else {
                initialNodes.addAll(edges.get(key));
            }
        }
        return -1;
    }
}
