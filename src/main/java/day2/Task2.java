package day2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        //System.out.print("введите 2 целых числа ч/з пробел: ");
        a = input.nextInt();
        b = input.nextInt();

        if (a >= b) System.out.println("Некорректный ввод");

        for (int i = a + 1 ; i < b; i += 1) {
            if ( i % 5 == 0 && i % 10 != 0 ) {
                System.out.print(i + " ");
            }
        }
    }
}
