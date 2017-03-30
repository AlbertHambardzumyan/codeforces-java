package problem_200;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_200B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int temp = 0;
        for (int i = 0; i < number; i++) {
            temp += in.nextInt();
        }

        System.out.print((double) temp / number);
    }
}