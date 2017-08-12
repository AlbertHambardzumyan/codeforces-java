package problem_837;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_837A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        in.nextLine();
        String input = in.nextLine();

        int max = 0, count = 0;
        char tmp;
        for (int i = 0; i < input.length(); i++) {
            tmp = input.charAt(i);
            if (tmp == ' ') {
                max = max < count ? count : max;
                count = 0;
            } else if (Character.isUpperCase(tmp)) count++;
        }
        max = max < count ? count : max;

        System.out.print(max);
    }
}