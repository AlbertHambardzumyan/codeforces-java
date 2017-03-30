package problem_448;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_448A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cups = 0, medals = 0;

        for (int i = 0; i < 3; i++)
            cups += in.nextInt();
        for (int i = 0; i < 3; i++)
            medals += in.nextInt();

        int shelves = in.nextInt();
        int count = 0;

        if (cups % 5 == 0)
            count += cups / 5;
        else
            count += cups / 5 + 1;
        if (medals % 10 == 0)
            count += medals / 10;
        else
            count += medals / 10 + 1;

        if (count <= shelves)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}