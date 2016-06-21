import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tin on 5/23/16.
 */
public class Pangrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        while (scanner.hasNext()) {
            String next = scanner.next();
            builder.append(next);
            if (next.endsWith("\n")) {
                break;
            }
        }
        if (isPangrams(builder.toString())) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }

    public static boolean isPangrams(String s) {
        List<Character> characterList = new ArrayList<>(26);
        char[] chars = s.toLowerCase().toCharArray();
        for (char aChar : chars) {
            if (aChar == ' ') {
                continue;
            }
            if (characterList.contains(aChar)) {
                continue;
            } else {
                characterList.add(aChar);
            }
            if (characterList.size() == 26) {
                return true;
            }
        }
        return false;
    }
}
