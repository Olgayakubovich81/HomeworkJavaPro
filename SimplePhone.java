package module_1.lecture_1.module_1.lecture_1;

public class SimplePhone {
    public static void main(String[] args) {

        Phone phone1= new Phone(123456,"Nokia", 100);
        Phone phone2 = new Phone(654321, "Samsung", 50);
        Phone phone3 = new Phone(777777,"Motorolla", 70 );

        phone1.receiveCall("John");
        phone1.getNumber();

        phone2.receiveCall("Mike");
        phone2.getNumber();

        phone3.receiveCall("Barbara");
        phone3.getNumber();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);







    }
}
