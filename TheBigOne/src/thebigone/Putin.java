/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebigone;

import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class Putin {

    private final Scanner scanner = new Scanner(System.in);
    private Fraction answer;

    public void displayInstructions() {

        System.out.println("you know the deal");

    }

    /**
     * @param args the command line arguments
     */

    public void scanner() {

        System.out.println("That is, enter fraction 1");
        String userInput = scanner.nextLine();

        Fraction f1 = this.parse(userInput);

        System.out.println("Enter fraction 2 please");
        userInput = scanner.nextLine();
        Fraction f2 = this.parse(userInput);
        answer = Meth.add(f1, f2);
    }

    public Fraction getAnswer() {
        return answer;
    }

    public Fraction parse(String userInput) {
         String[] numbersAsStrings = userInput.split("/");
        
        int numerator = Integer.parseInt(numbersAsStrings[0]);
        int denominator = Integer.parseInt(numbersAsStrings[1]);
        
        return new Fraction(numerator,denominator);
        
    }
}
//        boolean denominatorNumeratorSwitcher = true;
//        String numerator = null;
//        String denominator = null;      
//        int parseController = 1;
//        for (int i = 0; i < Input.length(); i++) {
//            for (int numeratorPosition = Input.indexOf("" + parseController); numeratorPosition < 0; numeratorPosition = Input.indexOf("" + parseController++)) {
//                System.out.println("The " + parseController + "th charachter has been erroneously entered.");
//            }
//
//            if ((int) Input.charAt(i) != 47 && denominatorNumeratorSwitcher == true) {
//                numerator += Input.charAt(i);
//                denominator += Input.charAt(i);
//            } else {
//                denominatorNumeratorSwitcher = false;
//                denominator += Input.charAt(i);
//            }
//        }
//        return new Fraction(Integer.parseInt(numerator), Integer.parseInt(denominator));
//    }
//}
