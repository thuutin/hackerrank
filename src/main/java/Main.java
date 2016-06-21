import java.util.Scanner;

/**
 * Created by tin on 4/30/16.
 */
public class Main {
    public static void main(String[] args){
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        final long bigSum = aVeryBigSum(scanner);
    }

    static long aVeryBigSum(Scanner scanner) {
        final int size = scanner.nextInt();
        long total = 0;
        for (int i = 0; i < size; i++) {
            total += scanner.nextLong();
        }
        return total;
    }

    static int[][] getMatrix(Scanner scanner){

        final int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    static int[] getDiagonals(int[][] matrix){
        int primaryDiagonal = 0;
        int otherDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            primaryDiagonal += matrix[i][i];
            otherDiagonal += matrix[i][matrix.length - i - 1];
        }

        return new int[]{primaryDiagonal, otherDiagonal};
    }
}
