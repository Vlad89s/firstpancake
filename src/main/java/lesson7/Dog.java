package lesson7;

public class Dog extends Animals {

    public Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("Пёс не понимает куда бежать");
        } else if (distance > 500) {
            System.out.println("Пёс не сможет пробежать это расстояние");
        }
        System.out.println("Пёс пробежал " + distance + " м");
    }
}
