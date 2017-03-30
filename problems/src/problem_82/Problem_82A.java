package problem_82;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_82A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String[] array = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        int result;

        int length = 5;
        int sum = 5;
        int count = 1;
        while (sum + length * 2 < input) {
            length = length * 2;
            sum += length;
            count *= 2;
        }
        count *= 2;
        if (input <= length)
            result = input - 1;
        else {
            if ((input - sum) % count == 0)
                result = (input - sum) / count - 1;
            else
                result = (input - sum) / count;
        }
        System.out.print(array[result]);
    }
}