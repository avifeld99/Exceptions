package be.intecbrussel.unchecked;

import java.util.ArrayList;
import java.util.Arrays;

public class LanguageChecker {

    ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python",
            "JavaScript"));

    public void checkLanguage(String language) {
        if (languages.contains(language)) {
            throw new CustomException(language + " already exists");
        } else {
            languages.add(language);
            System.out.println(language + " is added to the ArrayList");
        }
    }
}
