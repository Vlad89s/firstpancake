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
        float[] arr = new float[n];
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) Math.random();
            sum = sum + arr[i];
        }
        float min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }

        float max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            }

        float avg = 0;
        for (int i = 1; i < arr.length; i++) {
                avg = avg + arr[i];
            }
            avg = avg / n;
        System.out.println(Arrays.toString(arr) + "\n");
        System.out.println("минимальный элемент массива = " + min + "\nмаксимальный элемент массива = " + max + "\nсреднее значение массива = " + avg);
        System.out.println("--------------------------------------------------------");

//        Arrays.sort(arr);
//        System.out.println("min " + arr[0]);
//        System.out.println("max " + arr[n - 1]);
//        float gum = sum / n;
//        System.out.println(sum);
//        System.out.println(gum);
    }
}
