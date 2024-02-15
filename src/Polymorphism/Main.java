package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.animalSound();
        cat.catSound();
        dog.dogSound();
    }
}
