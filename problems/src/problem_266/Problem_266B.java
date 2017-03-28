package problem_266;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_266B {
    private static char[] array;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int time = in.nextInt();
        in.nextLine();
        String input = in.nextLine();

        array = new char[length];
        for (int i = 0; i < array.length; i++)
            array[i] = input.charAt(i);

        for (int j = 0; j < time; j++) {
            for (int i = 0; i < array.length; i++) {
                if (i + 1 < array.length && array[i] == 'B' && array[i + 1] == 'G') {
                    swap(i);
                    i++;
                }
            }
        }
        for (char anArray : array) System.out.print(anArray);
    }

    private static void swap(int a) {
        char temp = array[a];
        array[a] = array[a + 1];
        array[a + 1] = temp;
    }
}