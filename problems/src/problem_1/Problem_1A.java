package problem_1;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_1A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();

        long temp1, temp2;

        temp1 = m % a == 0 ? m / a : m / a + 1;
        temp2 = n % a == 0 ? n / a : n / a + 1;

        System.out.print(temp1 * temp2);
    }
}