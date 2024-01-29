package task1;

abstract class Translator {
    String name;
    int age;
    String gender;

    public Translator(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    abstract String translate(String text);
}