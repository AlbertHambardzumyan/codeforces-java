package problem_116;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_116A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int states = in.nextInt();

        int temp = 0, count = 0;
        for (int i = 0; i < states; i++) {
            temp -= in.nextInt();
            temp += in.nextInt();
            if (temp > count)
                count = temp;
        }

        System.out.print(count);
    }
}