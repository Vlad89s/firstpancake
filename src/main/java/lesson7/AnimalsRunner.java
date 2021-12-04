package lesson7;

public class AnimalsRunner {

    public static void main(String[] args) {

        Cat cat = new Cat("Пушок",200,0);
        Dog dog = new Dog("Бобик",500,10);
        ((Cat) cat).run(-1);
    }

}
