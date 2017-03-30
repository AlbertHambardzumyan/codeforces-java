package problem_270;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_270A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        String result;
        double t;
        double temp;
        for (int i = 0; i < number; i++) {
            temp = in.nextDouble();
            result = "NO";
            for (int j = 1; j <= 1000; j++) {
                t = (double) j * 180 / (j + 2);
                if (temp == t) {
                    result = "YES";
                }
            }
            System.out.println(result);
        }
    }
}