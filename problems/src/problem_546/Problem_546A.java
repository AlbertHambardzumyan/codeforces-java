package problem_546;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_546A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int price = in.nextInt();
        int money = in.nextInt();
        int amount = in.nextInt();
        int sum = 0, result;

        for (int i = 1; i <= amount; i++) {
            sum += price * i;
        }
        result = sum - money;
        if (result <= 0)
            result = 0;
        System.out.print(result);
    }
}