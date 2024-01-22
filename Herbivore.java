package Zoo;

// Подкласс Herbivore
class Herbivore extends Mammal {
    String preferredFood;

    public Herbivore(String name, int age, String species, String furColor, String preferredFood) {
        super(name, age, species, furColor);
        this.preferredFood = preferredFood;
    }

    public void graze() {

    }
}