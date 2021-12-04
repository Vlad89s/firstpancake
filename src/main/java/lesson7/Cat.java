package lesson7;

class Cat extends Animals{

    public Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    public void run (int distance) {
        if (distance <= 0) {
            System.out.println(Cat.name + "Кот не понимает куда бежать");
        } else if (distance > 200) {
            System.out.println("Кот не сможет пробежать это расстояние");
        } else {
            System.out.println("Кот пробежал " + distance + " м");
        }
    }
}
