package problem_507;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_507A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int days = in.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();

        StringBuilder result = new StringBuilder();
        int count = 0;
        int temp = 0;
        int lookFor = 1;
        while (temp <= days && lookFor <= 100) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == lookFor) {
                    if (temp + lookFor <= days) {
                        temp += lookFor;
                        result.append(i + 1).append(" ");
                        count++;
                    }
                }
            }
            lookFor++;
        }
        if (result.toString().equals(""))
            System.out.print(count);
        else {
            System.out.println(count);
            System.out.print(result);
        }
    }
}