/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment28;

import java.util.Scanner;

/**
 *
 * @author SomeDude
 */
public class assignment28 {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your integer betwee 0 and 65535: ");
        int x = reader.nextInt();
        String decoded = String.valueOf(Character.toChars(x));
        System.out.println(decoded);
    }
}