/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment19;

import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment19 {

    public static void main(String[] args) {
        int i ;
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your string: ");
        String username = reader.next();
        for (i = 0; i < username.length(); i++) {

            char a_char = username.charAt(i);
            System.out.println(a_char);
        }
    }
}
