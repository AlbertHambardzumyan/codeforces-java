package problem_835;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_835A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int characters = in.nextInt();
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        int t1 = in.nextInt();
        int t2 = in.nextInt();

        int first = characters * v1 + 2 * t1;
        int second = characters * v2 + 2 * t2;

        String result;
        if (first < second) result = "First";
        else if (first > second) result = "Second";
        else result = "Friendship";

        System.out.print(result);
    }
}