package problem_560;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_560A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int temp;
        boolean result = false;
        for (int i = 0; i < number; i++) {
            temp = in.nextInt();
            if (temp == 1)
                result = true;
        }
        if (result)
            System.out.print(-1);
        else
            System.out.print(1);
    }
}