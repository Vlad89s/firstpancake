package lesson2;

public class SecondProgram {

    public static void main(String[] args) {
        long result = calculate(2, 3, 6);
        System.out.println(result);
        long resultOther = calculate(32, 51, 10);
        System.out.println(resultOther);
        long resultAnother = calculate(42, 845, 8788);
        System.out.println(resultAnother);
    }
    public static int calculate(int arg1, int arg2, int arg3) {
        int R = (arg1 + arg1) * arg2;
        int i = (R / arg3) - arg1;
        return i;
    }
}