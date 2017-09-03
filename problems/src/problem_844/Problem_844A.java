package problem_844;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_844A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int k = in.nextInt();

        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char tmp = input.charAt(i);
            if (!arrayList.contains(tmp)) arrayList.add(tmp);
        }

        if (input.length() < k) System.out.print("impossible");
        else if (arrayList.size() > k) System.out.print(0);
        else System.out.print(k - arrayList.size());
    }
}