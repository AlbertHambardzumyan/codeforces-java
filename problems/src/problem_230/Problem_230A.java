package problem_230;

import java.util.*;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_230A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int power = in.nextInt();
        int drakon = in.nextInt();
        in.nextLine();
        LinkedList<Integer>[] list = new LinkedList[10000];
        for (int i = 0; i < list.length; i++)
            list[i] = new LinkedList<Integer>();

        StringTokenizer st;
        int temp1, temp2;
        for (int i = 0; i < drakon; i++) {
            st = new StringTokenizer(in.nextLine());
            temp1 = Integer.parseInt(st.nextToken());
            temp2 = Integer.parseInt(st.nextToken());
            list[temp1 - 1].add(temp2);
        }
        Iterator<Integer>[] iterator = new Iterator[10000];
        for (int i = 0; i < iterator.length; i++)
            iterator[i] = list[i].iterator();

        String result = "YES";
        for (int i = 0; i < iterator.length; i++) {
            while (iterator[i].hasNext()) {
                if (power - 1 > i)
                    power += iterator[i].next();
                else {
                    result = "NO";
                    break;
                }
            }
        }
        System.out.print(result);
    }
}