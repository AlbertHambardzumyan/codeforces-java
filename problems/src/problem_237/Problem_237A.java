package problem_237;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_237A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = Integer.parseInt(in.nextLine());

        String temp = in.nextLine();
        int count = 1;
        String temp2;
        int result = 1;
        for (int i = 0; i < number - 1; i++) {
            temp2 = in.nextLine();
            if (temp.equals(temp2))
                count++;
            else {
                temp = temp2;
                count = 1;
            }

            if (result < count)
                result = count;
        }

        System.out.print(result);
    }
}