package Zoo;

class Carnivore extends Mammal {
    String huntingMethod;

    public Carnivore(String name, int age, String species, String furColor, String huntingMethod) {
        super(name, age, species, furColor);
        this.huntingMethod = huntingMethod;
    }

    public void hunt() {
           }
}
