package Zoo;

class Bird extends Animal {
    String featherColor;

    public Bird(String name, int age, String species, String featherColor) {
        super(name, age, species);
        this.featherColor = featherColor;
    }

    public void fly() {
           }
}