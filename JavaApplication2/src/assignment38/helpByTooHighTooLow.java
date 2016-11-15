/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment38;


import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class helpByTooHighTooLow extends countTakeOver {

    public static void advice(String algore, int s, int n, Scanner reader) {
        do {

            System.out.println("Enter a number: ");
            n = reader.nextInt();
            if (n > s) {
                System.out.println("too high");
                System.out.println(i);
            }
            if (n < s) {
                System.out.println("too low");
            }
        } while (n != s);
    }
}
