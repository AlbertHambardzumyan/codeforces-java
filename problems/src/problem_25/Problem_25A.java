package problem_25;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_25A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();

        int look = 0;
        boolean flag = true;
        if (array[0] % 2 == 0 && array[1] % 2 == 0)
            look = 1;
        else if ((array[0] % 2 == 0 && array[1] % 2 == 1)) {
            if (array[2] % 2 == 1) {
                System.out.print(1);
                flag = false;
            } else {
                System.out.print(2);
                flag = false;
            }
        } else if ((array[0] % 2 == 1 && array[1] % 2 == 0)) {
            if (array[2] % 2 == 1) {
                System.out.print(2);
                flag = false;
            } else {
                System.out.print(1);
                flag = false;
            }
        }

        if (flag) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == look) {
                    System.out.print(i + 1);
                    break;
                }
            }
        }
    }
}