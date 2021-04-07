package day2;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        final double z = 420.0;
        double x, y;
        Scanner input = new Scanner(System.in);

        x = input.nextDouble();

        if ( x >= 5) {
            System.out.println( (Math.pow(x,2) - 10) / (x + 7) );
        }
        else if (x > -3 && x < 5) {
            System.out.println((x + 3) * (Math.pow(x,2) - 2));
        }
        else {
            System.out.println(z);
        }
    }
}
