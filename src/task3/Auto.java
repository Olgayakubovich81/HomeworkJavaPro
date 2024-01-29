package task3;

public class Auto implements AutoMechanic,Driver {
 private boolean startEngine;

    public void performTI() {
        System.out.println("Проведен техосмотр.");
    }

    public void repair() {
        System.out.println("Выполнен ремонт.");

    }

    @Override
    public void drive() {
        System.out.println("Машина поехала.");
    }

    public void start() {
        startEngine = true;
        System.out.println("Двигатель запущен.");
    }

    public void stop() {
        startEngine = false;
        System.out.println("Двигатель остановлен.");
    }

          public void control() {
        if (startEngine) {
            System.out.println("Автомобиль управляется.");
        } else {
            System.out.println("Двигатель не запущен. Нельзя управлять автомобилем.");
        }
    }
}
