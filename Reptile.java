package Zoo;

class Reptile extends Animal {
    String scaleType;

    public Reptile(String name, int age, String species, String scaleType) {
        super(name, age, species);
        this.scaleType = scaleType;
    }

    public void baskInSunlight() {

    }
}