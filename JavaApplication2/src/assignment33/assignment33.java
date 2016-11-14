/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment33;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment33 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner reader = new Scanner(System.in);
        int s = rand.nextInt(1000) + 1;
        int n;
        int i = 0;
        do {

            System.out.println("Enter a number: ");
            n = reader.nextInt();
            i++;

        } while (n != s);
        System.out.println(i);
    }
}   
    

