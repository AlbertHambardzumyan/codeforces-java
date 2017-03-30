package problem_427;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_427A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int reserve = 0;
        int result = 0;
        int temp;
        for (int i = 0; i < number; i++) {
            temp = in.nextInt();
            if (temp == -1 && reserve > 0)
                reserve--;
            else if (temp == -1 && reserve == 0)
                result++;
            else if (temp > 0)
                reserve += temp;
        }

        System.out.print(result);
    }
}