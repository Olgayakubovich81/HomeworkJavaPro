package module_1.lecture_1.module_1.lecture_1;

public class Phone {
    int number;
    String model;

    int weight;

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("звонит " +name);
    }

    public int getNumber() {
        return number;
    }
}
