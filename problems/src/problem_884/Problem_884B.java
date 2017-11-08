package problem_884;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_884B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array_length = in.nextInt();
        int string_length = in.nextInt();

        int sum = 0;
        for (int i = 0; i < array_length; i++)
            sum += in.nextInt();

        String result = sum + array_length - 1 == string_length ? "YES" : "NO";
        System.out.print(result);
    }
}