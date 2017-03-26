package problem_281;


import java.util.Scanner;

/**
 * @author Albert Hambardzumyan
 */
public class Problem_281A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.print(input.substring(0, 1).toUpperCase() + input.substring(1, input.length()));
    }
}