package problem_474;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_474A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char dir = in.nextLine().charAt(0);
        String template = "qwertyuiop " + "asdfghjkl; " + "zxcvbnm,./";
        String input = in.nextLine();

        int differ;
        if (dir == 'R')
            differ = -1;
        else
            differ = 1;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < template.length(); j++) {
                if (input.charAt(i) == template.charAt(j))
                    result.append(template.charAt(j + differ));
            }
        }

        System.out.print(result);
    }
}