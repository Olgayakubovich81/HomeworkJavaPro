package Pets;

public class Pet {


    private String name;
    private int age;
    private int weight;

    public Pet() {
    }

    public Pet(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }


    public void run() {
        System.out.println(" домашний любимец по имени " + name + " бежит !");
    }

    public void makeSound() {
        System.out.println("Generic pet sound");
    }

    public void introduce() {
        System.out.println("Привет, меня зовут " + name + ", и мне " + age + " лет.");
    }
}