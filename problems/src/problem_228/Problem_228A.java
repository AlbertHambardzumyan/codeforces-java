package problem_228;

import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_228A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(input);

        String temp;
        int count = 1;
        String[] array = new String[4];
        array[0] = stringTokenizer.nextToken();

        while (stringTokenizer.hasMoreTokens() && count < 5) {
            temp = stringTokenizer.nextToken();
            if (!temp.equals(array[0]) && !temp.equals(array[1]) && !temp.equals(array[2]) && !temp.equals(array[3])) {
                array[count] = temp;
                count++;
            }
        }
        System.out.print(4 - count);
    }
}