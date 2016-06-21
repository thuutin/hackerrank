import java.util.Scanner;

/**
 * Created by tin on 4/30/16.
 */
public class TimeConversion {
    public static String main(String[] args){
        Scanner s = new Scanner("07:05:45PM\n");
        return getTimeIn24(s);
    }

    static String getTimeIn24(Scanner s) {
        final String timeIn12 = s.nextLine();
        final String amOrPm =  timeIn12.substring(timeIn12.length() - 2);
        if (amOrPm.equalsIgnoreCase("AM")){
            final int index = timeIn12.indexOf(':');
            int hour = Integer.parseInt(timeIn12.substring(0, index));
            if ( hour == 12 ){
                return "00" + timeIn12.substring(index, timeIn12.length() - 2);
            }
            return timeIn12.substring(0, timeIn12.length() - 2);
        } else {
            final int index = timeIn12.indexOf(':');
            int hour = Integer.parseInt(timeIn12.substring(0, index));
            if ( hour == 12 ){
                return "12" + timeIn12.substring(index, timeIn12.length() - 2);
            }
            return String.valueOf(hour + 12) +
                            timeIn12.substring(index, timeIn12.length() - 2);
        }
    }
}
