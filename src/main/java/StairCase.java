/**
 * Created by tin on 4/30/16.
 */
public class StairCase {

    public static void main(String[] args){
        final int size = 10;
        for (int i = 0; i < size; i++) {
            final int numOfSpaces = size - i - 1;
            final int numOfSharp =  i + 1;
            for (int i1 = 0; i1 < numOfSpaces; i1++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numOfSharp; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
