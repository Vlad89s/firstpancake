package lesson10;

import java.util.Scanner;

public class TemperatureConvertRunner {

    public static void main(String[] args) {

        TemperatureConvert temperature = new TemperatureConvert();

        do {
            System.out.println("Выберите пункт меню");
            System.out.println("1.Конвертация градусов Цельсия в градусы Фаренгейта");
            System.out.println("2.Конвертация градусов Фаренгейта в градусы Цельсия");
            Scanner choose = new Scanner(System.in);
            if (choose.hasNextInt()) {
                int input = choose.nextInt();
                switch (input) {
                    case 1 -> {
                        System.out.println("Введите температуру по шкале Цельсия для конвертации по шкале Фаренгейта");
                        if (!choose.hasNextDouble()) {
                            System.out.println("Некорректное число");
                        } else {
                            double celcius = choose.nextDouble();
                            System.out.println(celcius + "C = " + temperature.toFarenheit(celcius) + "F");
                        }
                    }
                    case 2 -> {
                        System.out.println("Введите температуру по шкале Фаренгейта для конвертации по шкале Цельсия");
                        if (!choose.hasNextDouble()) {
                            System.out.println("Некорректное число");
                        } else {
                            double fareinheit = choose.nextDouble();
                            System.out.println(fareinheit + "F = " + temperature.toCelcius(fareinheit) + "C");
                        }
                    }
                    default -> System.out.println("Вы ввели неверное число");
                }
            } else System.out.println("Вы ввели неверное число");
        } while (true);
    }
}