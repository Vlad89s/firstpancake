package lesson7;

public class AnimalsRunner {
    public static void main(String[] args) {
        Cat cat = new Cat("Пушок", 200, 0);
        Dog dog = new Dog("Бася", 500, 10);
        Tiger tiger = new Tiger("Амур", 1000, 50);
        ((Cat) cat).run(1);
        ((Dog) dog).run(190);
        ((Tiger) tiger).run(800);
        System.out.println("*****************************");
        ((Cat) cat).swim(8000);
        ((Dog) dog).swim(10);
        ((Tiger) tiger).swim(50);
    }
}
