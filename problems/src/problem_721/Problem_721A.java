package problem_721;

import java.util.LinkedList;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_721A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        in.nextLine();
        String input = in.nextLine();
        LinkedList<Integer> list = new LinkedList<>();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char tmp = input.charAt(i);
            if (tmp == 'B') count++;
            else if (count != 0) {
                list.addLast(count);
                count = 0;
            }
        }
        if (count > 0) list.addLast(count);

        System.out.println(list.size());
        while (!list.isEmpty()) System.out.print(list.pollFirst() + " ");
    }
}