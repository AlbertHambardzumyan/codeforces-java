package problem_349;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_349A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int temp;
        int money25 = 0;
        int money50 = 0;
        String result = "YES";
        for (int i = 0; i < number; i++) {
            temp = in.nextInt();
            if (temp == 25)
                money25++;
            else if (temp == 50) {
                if (money25 > 0) {
                    money25--;
                    money50++;
                } else {
                    result = "NO";
                    break;
                }
            } else if (temp == 100) {
                if (money50 > 0 && money25 > 0) {
                    money50--;
                    money25--;
                } else if (money25 >= 3)
                    money25 -= 3;
                else {
                    result = "NO";
                    break;
                }
            }
        }

        System.out.print(result);
    }
}