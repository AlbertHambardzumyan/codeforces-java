package problem_339;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_339B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int houses = in.nextInt();
        int jobs = in.nextInt();
        int[] array = new int[jobs];
        for (int i = 0; i < jobs; i++)
            array[i] = in.nextInt();

        int position = 1;
        long count = 0;
        int temp;
        for (int anArray : array) {
            temp = anArray;
            if (temp >= position) {
                count += temp - position;
                position = temp;
            } else if (temp < position) {
                count += (houses - position) + (temp);
                position = temp;
            }
        }
        System.out.print(count);
    }
}