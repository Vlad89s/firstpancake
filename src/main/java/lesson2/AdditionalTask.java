package lesson2;

public class AdditionalTask {
//Данная программа решает уравнение Архимедовой спирали p = (a / 2 * pi) * Fi,
//где a - это шаг спирали, Fi - это угол, измеряемый в радианах.
    public static void main(String[] args) {
        var result = calculate(3.1415, 2);
        System.out.println(result);
    }
    public static double calculate (double a, double f) {
        var pi = 3.1415;
        var rad = 180 / pi;
        var Fi = f * rad;
        var p = (a / (2 * pi) )* Fi;
        return p;
        }
    }



