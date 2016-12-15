/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apa.shape.app;

import java.util.Scanner;
import org.apa.shape.shapes.BaseShape;
import org.apa.shape.shapes.Circle;
import org.apa.shape.shapes.Square;
import org.apa.shape.shapes.Triangle;

/**
 *
 * @author Edison.Morrow
 */
public class Menue {

    public BaseShape getShape() {

        System.out.println("Enter desired shape for area.");
        System.out.println("1.Area of square.");
        System.out.println("2.Area of circle.");
        System.out.println("3.Area of triangle.");
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int option = reader.nextInt();
        switch (option) {
            case 1:
                Square square = new Square();

                return square;

            case 2:
                Circle circle = new Circle();

                return circle;

            case 3:
                Triangle triangle = new Triangle();

                return triangle;

            default:
                System.out.println("Incomatable character or value");
                break;
        }
        return null;

    }
}
