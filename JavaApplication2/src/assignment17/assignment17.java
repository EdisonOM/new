/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment17;

import java.util.Scanner;


/**
 *
 * @author Edison.Morrow
 */
public class assignment17 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your string: ");
        String username = reader.next();      
        
        String result = username.toUpperCase();
        String result1 = username.toLowerCase();
        System.out.println(result);
        System.out.println(result1);
    }
}
