/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment10;

import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment10 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a radius: ");
        double enteredRadius = reader.nextDouble();
        double area = enteredRadius * enteredRadius * 3.14;
        System.out.println(area);
    }
}
