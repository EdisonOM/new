/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment38;


import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Edison.Morrow
 */
public class assignment38 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner reader = new Scanner(System.in);
        int s = rand.nextInt(1000) + 1;
        int n=0;
        String[] choices = {"Distance away from number", "High or Low",};
        String algore = (String) JOptionPane.showInputDialog(null, "which "
                + "algorithim", "choice", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
        if (algore.equals("Distance away from number")) {
          helpByDistance.advice(algore, s, n, reader);
        }

        if (algore.equals("High or Low")) {
            helpByTooHighTooLow.advice(algore, s, n, reader);
        }
    }

}
