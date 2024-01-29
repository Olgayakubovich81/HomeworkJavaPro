package task1;

class EnglishToRussianTranslator extends Translator {
    public EnglishToRussianTranslator(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    String translate(String text) {
            return "Translation from English to Russian: " + text;
    }
}