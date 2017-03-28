package problem_271;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_271A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputInt = in.nextInt() + 1;

        String inputString;
        int[] array = new int[10];
        int temp;
        boolean flag = true;

        while (flag) {
            for (int i = 0; i < array.length; i++) {
                array[i] = 0;
            }
            inputString = inputInt + "";
            for (int i = 0; i < inputString.length(); i++) {
                temp = inputString.charAt(i) - 48;
                if (array[temp] == 0) {
                    array[temp] = 1;
                    if (i == inputString.length() - 1)
                        flag = false;
                } else {
                    inputInt++;
                    break;
                }
            }
        }
        System.out.print(inputInt);
    }
}