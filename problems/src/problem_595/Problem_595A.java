package problem_595;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_595A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int floor = in.nextInt();
        int houses = in.nextInt();

        int count = 0;
        int first;
        int second;
        for (int i = 0; i < floor; i++) {
            for (int j = 0; j < houses * 2; j += 2) {
                first = in.nextInt();
                second = in.nextInt();
                if (first == 1 || second == 1)
                    count++;
            }
        }

        System.out.print(count);
    }
}
