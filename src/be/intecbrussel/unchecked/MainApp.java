package be.intecbrussel.unchecked;

import be.intecbrussel.checked.CustomException;

public class MainApp {
    public static void main(String[] args) {

        CustomException customException = new CustomException("kjghf");

        LanguageChecker checker = new LanguageChecker();

        checker.checkLanguage("C#");
        checker.checkLanguage("Java");
    }
}
