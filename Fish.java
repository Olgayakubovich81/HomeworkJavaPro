package Zoo;

class Fish extends Animal {
    String finType;

    public Fish(String name, int age, String species, String finType) {
        super(name, age, species);
        this.finType = finType;
    }

    public void swim() {

    }
}
