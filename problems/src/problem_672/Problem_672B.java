package problem_672;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_672B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        in.nextLine();
        String input = in.nextLine();

        if (length > 26) System.out.print(-1);
        else {
            int[] array = new int[26];

            for (int i = 0; i < input.length(); i++) {
                int tmp = (int) input.charAt(i);
                array[tmp - 97]++;
            }

            int count = 0;
            for (int anArray : array) if (anArray > 1) count += anArray - 1;

            System.out.print(count);
        }
    }
}