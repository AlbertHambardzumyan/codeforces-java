package problem_112;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_112A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String first = in.nextLine().toUpperCase();
        String second = in.nextLine().toUpperCase();

        int one, two;
        String result = "";

        for (int i = 0; i < first.length(); i++) {
            one = first.charAt(i);
            two = second.charAt(i);
            if (one > two) {
                result = "1";
                break;
            } else if (one == two) {
                result = "0";
            } else {
                result = "-1";
                break;
            }
        }
        System.out.print(result);
    }
}