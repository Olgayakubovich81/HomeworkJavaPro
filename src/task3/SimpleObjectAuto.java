package task3;

import task3.Auto;
import task3.AutoMechanic;
import task3.Driver;

public class SimpleObjectAuto {
    public static void main(String[] args) {
        Auto auto = new Auto();


        Driver driver = auto;
        driver.start();
        driver.drive();


        AutoMechanic autoMechanic = auto;
        autoMechanic.performTI();
        autoMechanic.repair();

    }
}