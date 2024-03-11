package Inlämningsuppgift;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Logic logic = new Logic();

        System.out.println("English to Morse, press 1. ");
        System.out.println("Morse to English, press 2. ");

        try{

            int userChoice = Integer.parseInt(scan.nextLine());

            if (userChoice == 1) {

                System.out.println("Enter a letter: ");
                Character morseTestData = scan.nextLine().charAt(0);

                String morseResult = logic.getMorse(morseTestData);

                System.out.println(morseResult);

            } else if (userChoice == 2) {

                System.out.println("Enter a letter in morse: ");
                String englishTestData = scan.nextLine();

                Character englishResult = logic.getEnglish(englishTestData);

                System.out.println(englishResult);

            } else {
                System.out.println("Invalid input");
            }

        } catch (Exception e){
            System.out.println("Something went wrong");
        }



    }
}
