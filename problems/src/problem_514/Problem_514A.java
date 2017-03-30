package problem_514;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_514A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        long result = 0;

        int temp;
        for (int i = 0; i < number.length(); i++) {
            temp = number.charAt(i) - 48;
            if (!(i == 0 && temp == 9) && temp > 4)
                temp = 9 - temp;
            result = result * 10 + temp;
        }

        System.out.print(result);
    }
}