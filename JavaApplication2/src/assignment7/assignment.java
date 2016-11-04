/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        for (int j = 0; j < n + 1; j++) {
            Random rand = new Random();
            int s = rand.nextInt();
            System.out.println(s);
        }
    }
}


