package problem_451;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_451A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();

        int count = 0;
        while (i != 0 && j != 0) {
            i--;
            j--;
            count++;
        }
        if (count % 2 == 0)
            System.out.print("Malvika");
        else
            System.out.print("Akshat");
    }
}