package problem_758;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_758B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        int indexR = -1, indexB = -1, indexY = -1, indexG = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'R' && indexR == -1) indexR = i % 4;
            if (input.charAt(i) == 'B' && indexB == -1) indexB = i % 4;
            if (input.charAt(i) == 'Y' && indexY == -1) indexY = i % 4;
            if (input.charAt(i) == 'G' && indexG == -1) indexG = i % 4;
        }

        int red = 0, blue = 0, yellow = 0, green = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '!' && i % 4 == indexR) red++;
            if (input.charAt(i) == '!' && i % 4 == indexB) blue++;
            if (input.charAt(i) == '!' && i % 4 == indexY) yellow++;
            if (input.charAt(i) == '!' && i % 4 == indexG) green++;
        }

        System.out.print(red + " " + blue + " " + yellow + " " + green);
    }
}