package problem_478;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_478A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += in.nextInt();
        }
        if (sum % 5 != 0 || sum == 0)
            System.out.print(-1);
        else
            System.out.print(sum / 5);
    }
}