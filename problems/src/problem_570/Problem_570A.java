package problem_570;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_570A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int candidate = in.nextInt();
        int[] candidateVotes = new int[candidate];

        int cities = in.nextInt();
        int temp1, temp2, index;
        for (int i = 0; i < cities; i++) {
            temp1 = in.nextInt();
            index = 0;
            for (int j = 1; j < candidate; j++) {
                temp2 = in.nextInt();
                if (temp2 > temp1) {
                    temp1 = temp2;
                    index = j;
                }
            }
            candidateVotes[index]++;
        }

        temp1 = candidateVotes[0];
        index = 0;
        for (int i = 1; i < candidateVotes.length; i++) {
            if (candidateVotes[i] > temp1) {
                temp1 = candidateVotes[i];
                index = i;
            }
        }
        System.out.print(index + 1);
    }
}