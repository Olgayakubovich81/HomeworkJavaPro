package Task3;

public class Fish implements Swim {

    private String name;
    private int weight;

    public Fish(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }


    }

