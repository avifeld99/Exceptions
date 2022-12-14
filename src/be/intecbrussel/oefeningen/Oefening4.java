package be.intecbrussel.oefeningen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Please enter your number: ");
                int myNum = scanner.nextInt();
                System.out.println("your number is: " + myNum);
                break;
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("you didn't enter a int number, Exception -> " + inputMismatchException);
                scanner.next();
            }
        }
    }
}
