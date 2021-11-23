package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class SixthProgram {

    public static void main(String[] args) {

        Scanner size = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите длину массива");
            while (!size.hasNextInt()) {
                var s = size.next();
                System.out.println("длина массива не может быть равна " + s);
            }
            n = size.nextInt();
        }
        while (n <= 0);
        double[] arr = new double[n];
        System.out.println(Arrays.toString(random(arr)));
        System.out.println("---------------------------------------");
        minimum(arr);
        maximum(arr);
        average(arr);
    }

    public static double[] random(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*11);
        }
        return arr;
    }

    public static void minimum(double[] arr) {
        double min = arr[0];
        for (double v : arr) {
            if (v < min) min = v;
        }
        System.out.println("минимальный элемент массива = " + min);
    }

    public static void maximum(double[] arr) {
        double max = arr[0];
        for (double v : arr) {
            if (v > max) max = v;
        }
        System.out.println("максимальный элемент массива = " + max);
    }

    public static void average(double[] arr) {
        double sum = 0;
        double avg;
        for (double v : arr) {
            sum = sum + v;
        }
        avg = sum / arr.length;
        System.out.printf("среднее значение массива = " + "%.3f",avg );
    }
}