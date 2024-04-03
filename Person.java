package module_1.lecture_1.module_1.lecture_1;

public class Person {
    String fullname;
    int age;

    public Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }

    public Person() {
    }

    public void talk() {
        System.out.println("Такой-то " +fullname+ " говорит");
    }

    public void move() {
       System.out.println("Такой-то "  +fullname+ " идет");


    }
}
