package problem_479;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_479A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();
        int temp1, temp2, temp3, temp4, temp5, temp6;

        temp1 = one + two + three;
        temp2 = (one + two) * three;
        temp3 = one * (two + three);
        temp4 = one * two * three;
        temp5 = one + two * three;
        temp6 = one * two + three;

        int result = Math.max(Math.max(temp1, temp2), Math.max(temp3, temp4));
        System.out.print(Math.max(result, Math.max(temp5, temp6)));
    }
}