package Pets;

import Pets.Pet;

public class Cat extends Pet {

    private String color;


    public Cat(String name, int age, int weight, String color) {
        super(name, age, weight);
        this.color = color;

    }
    public void makeSound() {
        System.out.println("Мяу!");
    }

    public void catchMice() {
        System.out.println("Поймаю мышь!");
    }
}
