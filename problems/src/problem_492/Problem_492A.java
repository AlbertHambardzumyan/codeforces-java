package problem_492;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_492A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long input = in.nextInt();

        long levelCube = 1;
        long totalCube = 1;
        int i = 1;
        int level = 1;
        while (totalCube < input) {
            i++;
            levelCube = levelCube + i;
            totalCube += levelCube;
            if (totalCube <= input) {
                level++;
            }
        }

        System.out.print(level);
    }
}