package problem_136;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_136A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] friends = new int[number + 1];
        int temp;

        for (int i = 1; i < friends.length; i++) {
            temp = in.nextInt();
            friends[temp] = i;
        }
        for (int i = 1; i < friends.length; i++) {
            System.out.print(friends[i] + " ");
        }
    }
}