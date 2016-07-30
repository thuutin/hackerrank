import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tin on 7/30/16.
 */
public class MatrixLayoutRotation {
    //https://www.hackerrank.com/challenges/matrix-rotation-algo

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        final int M = s.nextInt();
        final int N = s.nextInt();
        final int R = s.nextInt();
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        int[][] ints = solve(matrix, R);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solve(int[][] array, int r) {

        final List<LinkedList<Integer>> linkedLists = convert(array);
        for (int i = 0; i < linkedLists.size(); i++) {
            LinkedList<Integer> integers = linkedLists.get(i);
            int optimizedR = r % integers.size();
            for (int i1 = 0; i1 < optimizedR; i1++) {
                integers.addLast(integers.pop());
            }
        }
        return convert(linkedLists, array.length, array[0].length);
    }

    static int[][] convert(List<LinkedList<Integer>> linkedLists, int M, int N) {
        int[][] array = new int[M][N];
        int corner = 1;
        for (int k = 0; k < linkedLists.size(); k++) {
            int i, j;
            i = j = k;
            do {
                array[i][j] = linkedLists.get(k).pop();
                if (corner == 1) {
                    j++;
                    if (j == array[0].length - 1 - k) {
                        corner++;
                    }
                } else if (corner == 2) {
                    i++;
                    if (i == array.length - 1 - k) {
                        corner++;
                    }
                } else if (corner == 3) {
                    j--;
                    if (j == k) {
                        corner++;
                    }
                } else if (corner == 4) {
                    i--;
                    if (i == k) {
                        corner = 1;
                    }
                }
            } while (i != k || j != k);
        }
        return array;
    }

    static List<LinkedList<Integer>> convert(int[][] array) {
        List<LinkedList<Integer>> linkedLists = new ArrayList<>();
        final int n = Math.min(array.length, array[0].length) / 2;
        int corner = 1;

        for (int k = 0; k < n; k++) {
            int i, j;
            i = j = k;
            LinkedList<Integer> integers = new LinkedList<>();
            do {
                integers.add(array[i][j]);
                if (corner == 1) {
                    j++;
                    if (j == array[0].length - 1 - k) {
                        corner++;
                    }
                } else if (corner == 2) {
                    i++;
                    if (i == array.length - 1 - k) {
                        corner++;
                    }
                } else if (corner == 3) {
                    j--;
                    if (j == k) {
                        corner++;
                    }
                } else if (corner == 4) {
                    i--;
                    if (i == k) {
                        corner = 1;
                    }
                }
            } while (i != k || j != k);
            linkedLists.add(integers);
        }
        return linkedLists;
    }

}