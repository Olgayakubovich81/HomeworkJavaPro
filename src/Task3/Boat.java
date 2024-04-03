package Task3;

public class Boat implements Swim {

    private int speed;

    public Boat(int speed) {
        this.speed = speed;

    }

    @Override
    public void swim() {
        System.out.println("The boat is swimming with a speed of " + speed + " knots.");
    }
}




