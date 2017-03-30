package problem_141;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_141A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();
        String mix = in.nextLine();

        int[] array1 = new int[26];
        for (int i = 0; i < first.length(); i++)
            array1[first.charAt(i) - 65]++;

        for (int i = 0; i < second.length(); i++)
            array1[second.charAt(i) - 65]++;

        int[] array2 = new int[26];
        for (int i = 0; i < mix.length(); i++)
            array2[mix.charAt(i) - 65]++;

        String result = "YES";
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != array1[i]) {
                result = "NO";
                break;
            }
        }

        System.out.print(result);
    }
}