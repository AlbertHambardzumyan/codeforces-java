package problem_443;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_443A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String line = input.substring(1, input.length() - 1).toUpperCase();
        char[] array = new char[26];

        char temp;
        for (int i = 0; i < line.length(); i++) {
            temp = line.charAt(i);
            array[temp - 65]++;
            i += 2;
        }

        int count = 0;
        for (char anArray : array) {
            if (anArray > 0)
                count++;
        }

        System.out.print(count);
    }
}