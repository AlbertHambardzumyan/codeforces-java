package problem_263;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_263A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (in.nextInt() == 1) {
                    System.out.print(Math.abs(i - 2) + Math.abs(j - 2));
                    flag = false;
                    break;
                }
            }
            if (!flag)
                break;
        }
    }
}