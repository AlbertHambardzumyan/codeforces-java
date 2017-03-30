package problem_344;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_344A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int temp1 = in.nextInt();
        int temp2;
        int count = 1;

        for (int i = 1; i < number; i++) {
            temp2 = in.nextInt();
            if (temp1 != temp2) {
                count++;
                temp1 = temp2;
            }
        }
        System.out.print(count);
    }
}