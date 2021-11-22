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
        System.out.println("--------------------------------------------------------");
        minimum(arr);
        maximum(arr);
        average(arr);
    }

    public static double[] random(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        return arr;
    }

    public static void minimum(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("\nминимальный элемент массива = " + min);
    }

    public static void maximum(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("максимальный элемент массива = " + max);
    }

    public static void average(double[] arr) {
        double sum = 0;
        double avg;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avg = sum / arr.length;
        System.out.println("среднее значение массива = " + avg);
    }
}