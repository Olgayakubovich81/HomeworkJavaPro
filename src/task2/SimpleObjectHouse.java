package task2;

public class SimpleObjectHouse {
    public static void main(String[] args) {
        Roof roof = new Roof();
        Walls walls = new Walls();
        Windows windows = new Windows();
        Doors doors = new Doors();

        House house = new House(roof, walls, windows, doors);

        Inhabitant inhabitant1 = new Inhabitant("John");
        Inhabitant inhabitant2 = new Inhabitant("Jane");

        house.addInhabitant(inhabitant1);
        house.addInhabitant(inhabitant2);

        System.out.print("Inhabitants in the house: ");

        for (Inhabitant inhabitant : house.getInhabitants()) {
            System.out.print(inhabitant.getName() + " ");
        }
    }
}