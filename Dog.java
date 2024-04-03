package Pets;

import Pets.Pet;

public class Dog extends Pet {
    private String breed;


    public Dog(String name, int age, int weight, String breed) {
        super(name, age, weight);
        this.breed = breed;

    }
        public void makeSound() {
            System.out.println("Гав-гав!");
        }

        public void wagTail() {
            System.out.println("Машу хвостом!");
        }
    }



