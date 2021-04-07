package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a, b, i;
        Scanner input = new Scanner(System.in);

        //System.out.print("введите 2 целых числа ч/з пробел: ");
        a = input.nextInt();
        b = input.nextInt();

        if (a >= b) System.out.println("Некорректный ввод");

        i = a + 1;
        while (i < b) {
            if ( i % 5 == 0 && i % 10 != 0 ) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
