package module_1.lecture_1.module_1.lecture_1;

public class SimplePerson {
  public static void main(String[] args) {
Person person1 = new Person();
 person1.fullname= "Tom";
 person1.age= 24;
 Person person2 = new Person("John", 30);
      person1.talk();
      person1.move();

      person2.talk();
      person2.move();

}
}