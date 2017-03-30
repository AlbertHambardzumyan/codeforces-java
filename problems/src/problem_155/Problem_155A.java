package problem_155;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_155A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] points = new int[number];

        for (int i = 0; i < points.length; i++)
            points[i] = in.nextInt();

        int min = points[0];
        int max = points[0];
        int count = 0;
        for (int i = 1; i < points.length; i++) {
            if (min > points[i]) {
                count++;
                min = points[i];
            }
            if (max < points[i]) {
                count++;
                max = points[i];
            }
        }

        System.out.print(count);
    }
}