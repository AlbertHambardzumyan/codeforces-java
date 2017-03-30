package problem_466;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_466A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int cheapRide = in.nextInt();
        int price = in.nextInt();
        int cheapPrice = in.nextInt();

        if (cheapPrice / cheapRide >= price)
            System.out.print(number * price);
        else {
            int temp = number / cheapRide;
            int sum = temp * cheapPrice;
            int rest = (number - temp * cheapRide) * price;
            if (rest <= cheapPrice)
                sum += rest;
            else
                sum += cheapPrice;
            System.out.print(sum);
        }
    }
}