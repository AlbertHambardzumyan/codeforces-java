package problem_26;

import java.util.Scanner;
import java.util.Stack;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_26B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char tmp = input.charAt(i);
            if (tmp == '(') stack.push(tmp);
            else if (tmp == ')' && !stack.isEmpty()) {
                stack.pop();
                count++;
            }
        }

        System.out.print(count * 2);
    }
}