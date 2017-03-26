package problem_158;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_158B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int[] group = new int[5];
        for (int i = 0; i < number; i++)
            group[in.nextInt()]++;

        int count = 0;
        count += group[4];

        int temp = Math.min(group[3], group[1]);
        count += temp;
        group[3] -= temp;
        group[1] -= temp;

        if (group[3] > 0)
            count += group[3];

        if (group[2] % 2 == 0)
            count += group[2] / 2;
        else {
            count += group[2] / 2 + 1;
            group[1] -= 2;
        }
        if (group[1] > 0) {
            if (group[1] % 4 == 0)
                count += group[1] / 4;
            else
                count += group[1] / 4 + 1;
        }

        System.out.print(count);
    }
}