package problem_37;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_37A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] array = new int[1000];
        for (int i = 0; i < number; i++)
            array[in.nextInt() - 1]++;

        int height = 1;
        int count = 0;
        int temp;
        for (int anArray : array) {
            if (anArray == 1)
                count++;
            else if (anArray > 1) {
                count++;
                temp = anArray;
                if (height < temp)
                    height = temp;
            }
        }

        System.out.print(height + " " + count);
    }
}