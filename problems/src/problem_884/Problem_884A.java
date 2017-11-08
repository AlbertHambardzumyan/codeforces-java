package problem_884;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_884A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int duration = in.nextInt();

        int day_count = 0;
        int sum = 0;
        for (int i = 0; i < days; i++) {
            int work_time = in.nextInt();

            sum += 86400 - work_time;
            day_count++;
            if (sum >= duration)
                break;
        }

        System.out.print(day_count);
    }
}