package lesson7;

class Cat extends Animals {
    public Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println(this.name + " не видит, куда плыть, да он и не умеет");
        } else {
            System.out.println(this.name + " не умеет плавать");
        }
    }
}
