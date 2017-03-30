package problem_268;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_268A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[][] colors = new int[number][2];

        for (int i = 0; i < colors.length; i++) {
            colors[i][0] = in.nextInt();
            colors[i][1] = in.nextInt();
        }
        int count = 0;
        for (int[] color : colors) {
            for (int[] color1 : colors) {
                if (color[0] == color1[1])
                    count++;
            }
        }

        System.out.print(count);
    }
}