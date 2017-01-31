/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebigone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class TheBigOne {

    private final Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public void scanner() {

        System.out.println("That is, enter fraction 1");
        String userInput = scanner.nextLine();

        List<Integer> f1 = this.parse(userInput);

        System.out.println("Enter fraction 2 please");
        userInput = scanner.nextLine();
        List<Integer> f2 = this.parse(userInput);

    }

    public List<Integer> parse(String Input) {
        boolean denominatorNumeratorSwitcher = true;
        String numerator = null;
        String denominator = null;
        List<Integer> ComponentList = new ArrayList();
        Scanner reader = new Scanner(System.in);
        String baseChar = reader.next();
        int parseController = 1;
        for (int i = 0; i < baseChar.length(); i++) {
            for (int numeratorPosition = baseChar.indexOf("" + parseController); numeratorPosition < 1; numeratorPosition = baseChar.indexOf("" + parseController++)) {
                System.out.println("The " + parseController + "th charachter has been erroneously entered.");
            }

            if ((int) baseChar.charAt(i) != 47 && denominatorNumeratorSwitcher == true) {
                numerator += baseChar.charAt(i);
                denominator += baseChar.charAt(i);
            } else {
                denominatorNumeratorSwitcher = false;
                denominator += baseChar.charAt(i);
                ComponentList.add(Integer.parseInt(numerator));
                ComponentList.add(Integer.parseInt(denominator));
            }
        }
        return ComponentList;
    }
}
