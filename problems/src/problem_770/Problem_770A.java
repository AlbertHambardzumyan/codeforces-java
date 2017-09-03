package problem_770;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_770A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        String sample = "abcdefghijklmnopqrstuvwxyz";
        int index = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(sample.charAt(index));
            index++;
            if (index == k) index = 0;
        }
    }
}