package be.intecbrussel.oefeningen;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Oefening3 {
    public static void main(String[] args) {

        System.out.println("Fill in a number:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);

        try {
            double aNumber = Double.parseDouble(input);
            System.out.println(aNumber);
        }
        catch (NumberFormatException numberFormatException) {
            System.out.println("Exception! -> " + numberFormatException);
        }
        finally {
            scanner.close();
        }
        System.out.println("This is the input we tried to convert: " + input);
    }
}
