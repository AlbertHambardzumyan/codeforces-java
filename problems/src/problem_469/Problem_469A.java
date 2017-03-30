package problem_469;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_469A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp;
        int level = in.nextInt();

        int firstTotal = in.nextInt();
        int[] a = new int[level + 1];
        for (int i = 0; i < firstTotal; i++) {
            temp = in.nextInt();
            a[temp]++;
        }

        int secondTotal = in.nextInt();
        for (int i = 0; i < secondTotal; i++) {
            temp = in.nextInt();
            a[temp]++;
        }

        String result = "I become the guy.";
        for (int i = 1; i < a.length; i++) {
            if (a[i] < 1) {
                result = "Oh, my keyboard!";
                break;
            }
        }
        System.out.print(result);
    }
}