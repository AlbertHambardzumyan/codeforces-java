package problem_255;

import java.util.Scanner;

/**
 * @author Albert Hambardzumyan
 */
public class Problem_255A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int iterations = in.nextInt();
        in.nextLine();

        int chest = 0;
        int biceps = 0;
        int back = 0;

        for (int i = 0; i < iterations; i++) {
            if (i % 3 == 0) chest += in.nextInt();
            if (i % 3 == 1) biceps += in.nextInt();
            if (i % 3 == 2) back += in.nextInt();
        }

        if (chest > biceps && chest > back)
            System.out.print("chest");
        else if (biceps > chest && biceps > back)
            System.out.print("biceps");
        else
            System.out.print("back");
    }
}