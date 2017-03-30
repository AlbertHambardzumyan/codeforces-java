package problem_513;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_513A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int point1 = in.nextInt();
        int point2 = in.nextInt();

        in.nextInt();
        in.nextInt();

        String result;
        if (point1 <= point2)
            result = "Second";
        else
            result = "First";

        System.out.print(result);
    }
}