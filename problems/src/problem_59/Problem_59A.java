package problem_59;

import java.util.Scanner;


/**
 * * Created by Alik on 11/1/2015.
 */
public class Problem_59A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        int temp;
        int uppercase = 0, lowercase = 0;
        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            if (temp >= 65 && temp <= 90)
                uppercase++;
            else if (temp >= 97 && temp <= 122)
                lowercase++;
        }

        if (uppercase > lowercase)
            System.out.print(input.toUpperCase());
        else
            System.out.print(input.toLowerCase());
    }
}