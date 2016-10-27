/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment9;

import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment9 {
      public static void main(String[] args) {
          Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
          double x = Math.sqrt(n); 
      System.out.println(x);
      } 
    
    
}
