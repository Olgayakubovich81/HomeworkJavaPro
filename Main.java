package Pets;

import Pets.Cat;
import Pets.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурка", 10, 15, "серый");
        Dog dog = new Dog("Портос", 2, 25, "Labrador");

        cat.introduce();
        cat.catchMice();
        cat.makeSound();

        dog.introduce();
        dog.wagTail();
        dog.makeSound();

    }
}
