package lesson7;

public class Animals {
    String name;
    int runDistance;
    int swimDistance;

    public Animals(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public void run(int distance) {
        if (distance <= 0) {
            System.out.println(this.name + " не понимает куда бежать");
        } else if (distance > this.runDistance) {
            System.out.println(this.name + " не сможет пробежать это расстояние");
        } else {
            System.out.println(this.name + " пробежал " + distance + " м");
        }
    }

    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println(this.name + " не видит, куда плыть");
        } else if (distance > this.swimDistance) {
            System.out.println(this.name + " не сможет проплыть " + distance + " м");
        } else {
            System.out.println(this.name + " пропыл " + distance + " м");
        }
    }
}
