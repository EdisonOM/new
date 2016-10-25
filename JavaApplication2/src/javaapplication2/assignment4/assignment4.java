/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2.assignment4;

import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment4 {
     public static void main(String[] args) {
          Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        int j = 0;
        if (n < 0) {
            int l = 0;

            boolean done = false;
            while (!done) {
                System.out.println(l);
                if (l == n) {
                    done = true;
                }
                l--;
            }
        }
        if (n > 0) {
            boolean done = false;
            while (!done) {
                System.out.println(j);
                if (j == n) {
                    done = true;
                }

                j++;
            }

        }
     }
}
