package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double x, y;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            x = input.nextDouble();
            y = input.nextDouble();
            if (y == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println( x / y);
        };
    }
}
