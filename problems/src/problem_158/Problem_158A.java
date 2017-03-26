package problem_158;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_158A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int participants = in.nextInt();
        int place = in.nextInt();

        int[] points = new int[participants];
        for (int i = 0; i < points.length; i++){
            points[i] = in.nextInt();
        }

        int count = 0;
        int temp = points[place-1];
        for (int point : points) {
            if (point != 0 && point >= temp)
                count++;
        }

        System.out.print(count);
    }
}