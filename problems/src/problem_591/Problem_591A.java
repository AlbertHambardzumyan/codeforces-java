package problem_591;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_591A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int speed1 = in.nextInt();
        int speed2 = in.nextInt();

        double time = (double) length / (speed1 + speed2);
        System.out.print(time * speed1);
    }
}