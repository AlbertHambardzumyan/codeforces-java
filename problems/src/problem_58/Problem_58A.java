package problem_58;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_58A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        boolean[] array = new boolean[4];

        char temp;
        boolean flag = false;
        String result = "YES";

        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
            if (temp == 'h' && !array[0])
                array[0] = true;
            else if (temp == 'e' && array[0])
                array[1] = true;
            else if (temp == 'l' && array[1]) {
                if (!flag)
                    flag = true;
                else
                    array[2] = true;
            } else if (temp == 'o' && array[2])
                array[3] = true;
        }

        for (boolean anArray : array) {
            if (!anArray)
                result = "NO";
        }
        System.out.print(result);
    }
}