package problem_617;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_617A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int coordinate = in.nextInt();

        int result = coordinate / 5;
        result += (coordinate % 5) == 0 ? 0 : 1;
        System.out.print(result);
    }
}