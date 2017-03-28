package problem_148;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_148A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int l = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int dragons = in.nextInt();

        boolean[] array = new boolean[dragons + 1];
        for (int i = k; i < array.length; i += k)
            array[i] = true;
        for (int i = l; i < array.length; i += l)
            array[i] = true;
        for (int i = m; i < array.length; i += m)
            array[i] = true;
        for (int i = n; i < array.length; i += n)
            array[i] = true;

        int result = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i])
                result++;
        }
        System.out.print(result);
    }
}