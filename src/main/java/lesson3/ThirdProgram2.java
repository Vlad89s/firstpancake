package lesson3;

import java.util.Scanner;

public class ThirdProgram2 {

    public static void main(String[] args) {
        System.out.println("Введите натуральное число n");
        Scanner console = new Scanner(System.in);
        if (console.hasNextLong()) {
            long n = console.nextLong(), y = 1;
            if (n < 0) {
                System.out.println("Вы ввели не натуральное число");
            } else if (n == 0) {
                System.out.println("Факториал числа " + n + " равен " + y);
            } else for (int x = 1; x <= n; x++) {
                y = y * x;
                if (x == n) {
                    System.out.println("Факториал числа " + n + " равен " + y);
                }
            }
        }
        else {
            System.out.println("Вы ввели не натуральное число");
        }
    }
}


