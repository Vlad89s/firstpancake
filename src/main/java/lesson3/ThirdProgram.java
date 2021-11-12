package lesson3;

public class ThirdProgram {

    public static void main(String[] args) {
        double param = calculate(1, 4, 1);
        System.out.println(param);
    }
    private static double calculate(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
        } else if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("x= " + x);
        } else {
            System.out.println("Нет действительных решений уравнения");
        }
        return 0;
    }
}
