package problem_133;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_133B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            result *= 16;
            char tmp = input.charAt(i);
            if (tmp == '>') result += 8;
            else if (tmp == '<') result += 9;
            else if (tmp == '+') result += 10;
            else if (tmp == '-') result += 11;
            else if (tmp == '.') result += 12;
            else if (tmp == ',') result += 13;
            else if (tmp == '[') result += 14;
            else if (tmp == ']') result += 15;


            result = result % 1000003;
        }

        System.out.print(result);
    }
}