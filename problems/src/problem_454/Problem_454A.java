package problem_454;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_454A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int middle = size / 2;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= middle) {
                    if (j <= middle + i && j >= middle - i)
                        System.out.print("D");
                    else
                        System.out.print("*");
                } else {
                    if (j <= size - (i - middle) - 1 && j >= i - middle)
                        System.out.print("D");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}