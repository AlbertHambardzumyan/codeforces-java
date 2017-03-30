package problem_144;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_144A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] height = new int[number];
        int min;
        int max;
        int count = 0;

        for (int i = 0; i < height.length; i++) {
            height[i] = in.nextInt();
        }

        max = height[0];
        int maxIndex = 0;
        for (int i = 1; i < height.length; i++) {
            if (max < height[i]) {
                max = height[i];
                maxIndex = i;
            }
        }
        count += maxIndex;

        min = height[height.length - 1];
        int minIndex = height.length - 1;
        for (int i = height.length - 2; i >= 0; i--) {
            if (min > height[i]) {
                min = height[i];
                minIndex = i;
            }
        }
        if (minIndex > maxIndex)
            count += height.length - 1 - minIndex;
        else
            count += height.length - 1 - minIndex - 1;

        System.out.print(count);
    }
}