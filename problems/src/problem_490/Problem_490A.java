package problem_490;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_490A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<Integer> list3 = new ArrayList<Integer>();

        int temp;
        int c1 = 0, c2 = 0, c3 = 0;
        for (int i = 0; i < number; i++) {
            temp = in.nextInt();
            if (temp == 1) {
                list1.add(i + 1);
                c1++;
            } else if (temp == 2) {
                list2.add(i + 1);
                c2++;
            } else if (temp == 3) {
                list3.add(i + 1);
                c3++;
            }
        }
        Iterator l1 = list1.iterator();
        Iterator l2 = list2.iterator();
        Iterator l3 = list3.iterator();
        int result = Math.min(Math.min(c1, c2), c3);
        System.out.println(result);
        while (l1.hasNext() && l2.hasNext() && l3.hasNext())
            System.out.println(l1.next() + " " + l2.next() + " " + l3.next());
    }
}