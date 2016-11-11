/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment16;

import java.util.Scanner;


/**
 *
 * @author Edison.Morrow
 */
public class assignment16 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your string: ");
        String username = reader.next();
        int length = username.length();        
        System.out.println(length);
    }

}
