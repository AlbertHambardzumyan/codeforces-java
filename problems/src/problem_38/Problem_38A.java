package problem_38;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_38A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rank = in.nextInt();

        int[] years = new int[100];
        for (int i = 1; i < rank; i++)
            years[i] = in.nextInt();

        int current_rank = in.nextInt();
        int dream_rank = in.nextInt();

        int result = 0;
        for (int i = current_rank; i < dream_rank; i++)
            result += years[i];

        System.out.print(result);
    }
}