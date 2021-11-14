package lesson4;

import java.util.Scanner;
//Блок проверки вводимого значения
public class FourthProgram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите натуральное число");
            while (!console.hasNextInt()) {
                console.next();
                System.out.println("Вы ввели не натуральное число");
            }
            n = console.nextInt();
        }
        while (n <= 0);
//Блок цикла с подбором переменной x до максимального значения, равного половине от вводимого значения.
        int x;
        for (x = 1; x <= n; x++) {
           int d = x * x;
           if ((d != n) & (x == n / 2)) {
               System.out.println("Данное число не имеет целочисленных корней");
           }
           if (d == n) {
               System.out.println("Корень числа " + n + " равен " + x);
               break;
           }
        }
    }
}
