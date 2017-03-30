package problem_519;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_519A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line;
        char temp;
        int white = 0, black = 0;
        for (int i = 0; i < 8; i++) {
            line = in.nextLine();
            for (int j = 0; j < 8; j++) {
                temp = line.charAt(j);
                if (temp == 'Q')
                    white += 9;
                else if (temp == 'R')
                    white += 5;
                else if (temp == 'B' || temp == 'N')
                    white += 3;
                else if (temp == 'P')
                    white += 1;
                else if (temp == 'q')
                    black += 9;
                else if (temp == 'r')
                    black += 5;
                else if (temp == 'b' || temp == 'n')
                    black += 3;
                else if (temp == 'p')
                    black += 1;

            }
        }
        if (white > black)
            System.out.print("White");
        else if (white == black)
            System.out.print("Draw");
        else
            System.out.print("Black");
    }
}