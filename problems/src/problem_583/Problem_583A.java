package problem_583;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_583A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int road = in.nextInt();

        boolean[] vertical = new boolean[road + 1];
        boolean[] horizontal = new boolean[road + 1];
        boolean[] days = new boolean[road * road + 1];

        int temp1, temp2;
        for (int i = 1; i < days.length; i++) {
            temp1 = in.nextInt();
            temp2 = in.nextInt();
            if (!(vertical[temp1]) && !(horizontal[temp2])) {
                vertical[temp1] = true;
                horizontal[temp2] = true;
                days[i] = true;
            }
        }
        for (int i = 1; i < days.length; i++) {
            if (days[i])
                System.out.print(i + " ");
        }
    }
}