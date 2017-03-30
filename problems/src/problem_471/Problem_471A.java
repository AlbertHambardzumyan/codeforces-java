package problem_471;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_471A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] array = new int[9];
        for (int i = 0; i < 6; i++)
            array[in.nextInt() - 1]++;

        boolean temp2 = false, temp4 = false, temp6 = false, temp5 = false;

        for (int anArray : array) {
            if (anArray == 4)
                temp4 = true;
            else if (anArray == 5)
                temp5 = true;
            else if (anArray == 6)
                temp6 = true;
            else if (anArray == 2)
                temp2 = true;
        }

        if (temp6)
            System.out.print("Elephant");
        else if (temp5)
            System.out.print("Bear");
        else if (temp4) {
            if (temp2)
                System.out.print("Elephant");
            else
                System.out.print("Bear");
        } else
            System.out.print("Alien");
    }
}