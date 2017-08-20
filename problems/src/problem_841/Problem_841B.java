package problem_841;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_841B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();


        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < length; i++) {
            sum += in.nextInt();
            if (sum % 2 != 0) {
                flag = true;
                break;
            }
        }

        String result = flag ? "First" : "Second";
        System.out.print(result);
    }
}