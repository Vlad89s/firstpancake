package lesson8;

public class AnimalsRunner {

    public static void main(String[] args) {
        Animals cat = new Cat("кот", "Мяу!");
        Animals dog = new Dog ("собака", "Гав!");
        Animals parrot = new Parrot ("попугай", "\"Never Gonna Give You Up!\" ");
        Animals[] animals = new Animals[]{cat, dog, parrot};
        for (Animals voiceAnimal : animals) {
            voiceAnimal.voice();
        }
    }
}
