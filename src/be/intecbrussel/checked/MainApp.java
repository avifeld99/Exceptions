package be.intecbrussel.checked;

public class MainApp {
    public static void main(String[] args) {

        LanguageChecker checker = new LanguageChecker();
        try {
            checker.checkLanguage("C#");
            checker.checkLanguage("Java");
        }
        catch(CustomException customException) {
            System.out.println("[" + customException + "] Exception Occurred");
        }
    }
}
