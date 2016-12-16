/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apa.bark.app;

import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author Edison.Morrow
 */
public class Menue {

    public static void Menue () {
String[] choices = {"Bark Like <<Your subsequent entered name>>", "Bark like a dog", "Bark like a cat", "Bark like a mouse", "exit"};
        String barker = (String) JOptionPane.showInputDialog(null, "Choose a "
                + "Barker!", "Barkers:", JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[1]);
        
        Scanner reader = new Scanner(System.in);
        
        switch (barker) {
            case "Bark Like <<Your subsequent entered name>>":
                System.out.println("Enter a Username: ");
                String username = reader.next();
                UsernameBarker.bark(username);
                break; 
            case "Bark like a dog":
               DogBarker.bark();
               break;
            case "Bark like a cat":
               CatBarker.bark();
               break;
                
            case "Bark like a mouse":
                MouseBarker.bark();
                break;

            default:
                System.out.println("exiting");
                break;
        }
       

    }
}
