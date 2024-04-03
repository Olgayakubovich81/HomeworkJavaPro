package Zoo;

class Mammal extends Animal {
    String furColor;

    public Mammal(String name, int age, String species, String furColor) {
        super(name, age, species);
        this.furColor = furColor;
    }

    public void produceMilk() {
            }
}