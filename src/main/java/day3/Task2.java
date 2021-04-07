package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double x, y;
        Scanner input = new Scanner(System.in);

        do {
        x = input.nextDouble();
        y = input.nextDouble();
        if (y == 0) break;
        System.out.println( x / y);
        } while (true);

    }
}
