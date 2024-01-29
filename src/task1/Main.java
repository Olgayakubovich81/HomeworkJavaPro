package task1;

import task1.EnglishToRussianTranslator;

public class Main {
    public static void main(String[] args) {
        EnglishToRussianTranslator englishToRussianTranslator = new EnglishToRussianTranslator("Иван", 30, "М");
        String result1 = englishToRussianTranslator.translate("Hello, how are you?");
        System.out.println(result1);

        RussianToGermanTranslator russianToGermanTranslator = new RussianToGermanTranslator("Елена", 25, "Ж");
        String result2 = russianToGermanTranslator.translate("Привет, как дела?");
        System.out.println(result2);
    }
}