package be.intecbrussel.checked;

import be.intecbrussel.checked.CustomException;

import java.util.ArrayList;
import java.util.Arrays;

public class LanguageChecker {

    ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python",
            "JavaScript"));
    public void checkLanguage(String language) throws CustomException {
        // throw exception if language already present in ArrayList
        if (languages.contains(language)) {
            throw new CustomException(language + " already exists");
        } else {
            // insert language to ArrayList
            languages.add(language);
            System.out.println(language + " is added to the ArrayList");
        }
    }
}
