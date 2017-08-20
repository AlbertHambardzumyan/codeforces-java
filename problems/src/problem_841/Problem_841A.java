package problem_841;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_841A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        int friends = in.nextInt();
        in.nextLine();
        String colors = in.nextLine();

        int[] array = new int[26];
        for (int i = 0; i < colors.length(); i++) {
            char tmp = colors.charAt(i);
            int index = (int) tmp;
            array[index - 97]++;
        }

        String result = "YES";
        for (int anArray : array) {
            if (anArray > friends) {
                result = "NO";
                break;
            }
        }

        System.out.print(result);
    }
}