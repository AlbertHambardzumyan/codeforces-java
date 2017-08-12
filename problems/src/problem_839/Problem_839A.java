package problem_839;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_839A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int days = in.nextInt();
        int total_candies = in.nextInt();

        int result = -1;

        if (days * 8 >= total_candies) {
            int sum = 0, remaining = 0;
            for (int i = 0; i < days; i++) {
                int tmp = in.nextInt();
                if (tmp > 8) {
                    sum += 8;
                    remaining += tmp - 8;
                } else {
                    int additional;
                    if (remaining > 8 - tmp) {
                        additional = 8 - tmp;
                        remaining -= 8 - tmp;
                    } else {
                        additional = remaining;
                        remaining = 0;
                    }
                    sum += tmp + additional;
                }

                if (sum >= total_candies) {
                    result = i + 1;
                    break;
                }
            }
        }

        System.out.print(result);
    }
}