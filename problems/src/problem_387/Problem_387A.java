package problem_387;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_387A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();

        int minute1 = Integer.parseInt(first.substring(3));
        int minute2 = Integer.parseInt(second.substring(3));
        int flag = 0;
        String minute;
        if (minute1 >= minute2)
            minute = minute1 - minute2 + "";
        else {
            flag = 1;
            minute = 60 + minute1 - minute2 + "";
        }
        int hour1 = Integer.parseInt(first.substring(0, 2));
        int hour2 = Integer.parseInt(second.substring(0, 2));
        String hour;
        if (hour1 >= hour2 + flag)
            hour = hour1 - hour2 - flag + "";
        else
            hour = 24 + hour1 - hour2 - flag + "";

        if (hour.length() == 1)
            hour = "0" + hour;
        if (minute.length() == 1)
            minute = "0" + minute;
        System.out.print(hour + ":" + minute);
    }
}