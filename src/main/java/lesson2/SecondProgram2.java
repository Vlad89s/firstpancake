package lesson2;

public class SecondProgram2<sqrt> {
// Программа решает квадратное уравнение ax^2 + bx + c = 0. Условие значения дискриминанта также учитывается.
    public static void main(String[] args) {
        double param = calculate(3,4,1);
        System.out.println(param);
    }
    public static double calculate(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        }
        else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("x= " + x);
        }
        else {
            System.out.println("Данное уравнение не имеет действительных корней.");
        }
        return 0;
    }
}
