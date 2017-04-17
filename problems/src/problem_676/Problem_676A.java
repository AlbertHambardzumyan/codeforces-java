package problem_676;

import java.util.Scanner;

/**
 * @author Albert Hambardzumyan
 */
public class Problem_676A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iterations = in.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_index = 0, max_index = 0, tmp;
        for (int i = 0; i < iterations; i++) {
            tmp = in.nextInt();
            if (tmp > max) {
                max = tmp;
                max_index = i;
            }
            if (tmp < min) {
                min = tmp;
                min_index = i;
            }
        }

        int result = Math.abs(max_index - min_index);
        result += Math.max(iterations - 1 - Math.max(min_index, max_index), Math.min(min_index, max_index));
        System.out.print(result);
    }
}