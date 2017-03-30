package problem_581;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_581A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int red = in.nextInt();
        int blue = in.nextInt();
        System.out.print(Math.min(red, blue) + " " + (Math.abs(red - blue) / 2));
    }
}