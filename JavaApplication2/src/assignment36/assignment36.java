/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment36;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Edison.Morrow
 */
public class assignment36 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner reader = new Scanner(System.in);
        int s = rand.nextInt(1000) + 1;
        int n;
        String[] choices = {"Distance away from number", "High or Low",};
        String algore = (String) JOptionPane.showInputDialog(null, "which "
                + "algorithim", "Color", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
        if (algore.equals("Distance away from number")) {
            do {

                System.out.println("Enter a number: ");
                n = reader.nextInt();
                if (n > s) {
                    System.out.println(n - s + " too high");
                }
                if (n < s) {
                    System.out.println(s - n + " too low");
                }
            } while (n != s);
        }

        if (algore.equals("High or Low")) {
            do {

                System.out.println("Enter a number: ");
                n = reader.nextInt();
                if (n >= s) {
                    System.out.println("too high");
                }
                if (n <= s) {
                    System.out.println("too low");
                }
            } while (n != s);
        }
    }

}
