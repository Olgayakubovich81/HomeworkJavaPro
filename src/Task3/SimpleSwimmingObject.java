package Task3;

public class SimpleSwimmingObject {
    public static void main(String[] args) {
        Human human = new Human("John", 30);
        Fish fish = new Fish("Goldie", 2);
        Boat boat = new Boat(20);

        human.swim();
        fish.swim();
        boat.swim();
    }
}