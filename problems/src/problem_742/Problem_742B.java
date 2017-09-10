package problem_742;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_742B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int x = in.nextInt();

        long count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            int number = in.nextInt();
            int required = number ^ x;

            if (map.containsKey(required)) count += map.get(required);

            int tmp = 0;
            if (map.containsKey(number)) tmp = map.get(number);
            map.put(number, ++tmp);
        }

        System.out.print(count);
    }
}