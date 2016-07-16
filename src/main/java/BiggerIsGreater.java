import java.util.Arrays;

/**
 * Created by tin on 7/14/16.
 */
public class BiggerIsGreater {

    static String solve(String s) {
        char[] result = s.toCharArray();
        String remaining = s;
        for (int i = 0; i < s.length(); i++) {
            int choose = choose(remaining, s.charAt(i));
            if (choose == -1){
                // No character is bigger than s.charAt(i);
                // pick s.charAt(i);
                result[i] = s.charAt(i);
                remaining = remaining.substring(1);
                if (remaining.length() == 0){
                    return "no answer";
                }
            } else {
                result[i] = remaining.charAt(choose);
                remaining = substract(remaining, choose);
                break;
            }
        }
        Arrays.sort(remaining.toCharArray());
        for (int i = 0; i < remaining.length(); i++) {
          result[result.length - i - 1] = remaining.charAt(remaining.length() - 1 - i);
        }
        return new String(result);
    }

    static String substract(String remaining, int choose) {
        if (choose == 0){
            return remaining.substring(choose + 1, remaining.length() );
        }

        if (choose == remaining.length() - 1){
            return remaining.substring(0, choose);
        }
        final String before = remaining.substring(0, choose);
        final String after = remaining.substring(choose + 1, remaining.length() );
        return before.concat(after);
    }

    static int choose(String space, char base){
        char[] chars = space.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > base){
                return i;
            }
        }
        return -1;
    }


}
