package task1;

class RussianToGermanTranslator extends Translator {
    public RussianToGermanTranslator(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    String translate(String text) {
           return "Translation from Russian to German: " + text;
    }
}