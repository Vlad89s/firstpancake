package lesson2;

public class AdditionalTask {

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



