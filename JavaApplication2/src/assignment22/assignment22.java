/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment22;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment22 {

    public static void main(String[] args) {
        Random randomno = new Random();

        int i;
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your string: ");
        String username = reader.next();
        for (i = 0; i < username.length(); i++) {
            boolean value = randomno.nextBoolean();
            char a_char = username.charAt(i);
            String letter = Character.toString(a_char);
            while (value == true) {
                String result = letter.substring(0, 1).toUpperCase();
                System.out.println(result);
                value = randomno.nextBoolean();
            }
            while (value == false) {
                String result1 = letter.substring(0, 1).toLowerCase();
                System.out.println(result1);
                value = randomno.nextBoolean();
            }
        }
    }
}
