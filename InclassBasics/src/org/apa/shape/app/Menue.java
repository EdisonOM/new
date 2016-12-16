/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apa.shape.app;

import java.util.Scanner;
import javax.swing.JOptionPane;
import org.apa.shape.shapes.BaseShape;
import org.apa.shape.shapes.Circle;
import org.apa.shape.shapes.Square;
import org.apa.shape.shapes.Triangle;

/**
 *
 * @author Edison.Morrow
 */
public class Menue {

    public String getBarker () {
String[] choices = {"Bark Like <<Your subsequent entered name>>", "Bark like a dog", "Bark like a cat", "Bark like a mouse"};
        String barker = (String) JOptionPane.showInputDialog(null, "Choose a "
                + "Barker!", "Barkers:", JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[1]);
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        switch (barker) {
            case "Bark Like <<Your subsequent entered name>>":
                System.out.println("Enter a Username: ");
                String username = reader.next();
                PersonalBarker personalBarker = new PersonalBarker(String username);

                return personalBarker;

            case "Bark like a dog":
                DogBarker dogBarker = new DogBarker();

                return dogBarker;

            case "Bark like a cat":
                CatBarker catBarker = new CatBarker();

                return catBarker;
            case "Bark like a mouse":
                MouseBarker mouseBarker = new MouseBarker();

                return mouseBarker;

            default:
                System.out.println("Incomatable character or value");
                break;
        }
        return null;

    }
}
