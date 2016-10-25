/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment5 {
    
public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int x = reader.nextInt();
    int l=0;
    int j=0;
        do {
        
         System.out.println( l );
         l++;
         
      }while( l < x+1 );
   do {
        
         System.out.println( j );
         j--;
         
      }while( j > x-1 );
   }
}


