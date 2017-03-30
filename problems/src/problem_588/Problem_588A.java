package problem_588;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_588A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int temp1, temp2;
        int day = in.nextInt();
        int curPrice = in.nextInt();
        int result = curPrice * day;
        for (int i = 1; i < number; i++) {
            temp1 = in.nextInt();
            temp2 = in.nextInt();
            if (temp2 < curPrice)
                curPrice = temp2;
            result += curPrice * (temp1);
        }

        System.out.print(result);
    }
}