/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment8 {
     public static void main(String[] args) {
         do{
         Scanner reader = new Scanner(System.in);  // Reading from System.in
System.out.println("Enter a number: ");
int n = reader.nextInt();
   Random rand = new Random();
        int  s = rand.nextInt(10);
        System.out.println(s);
while(int j = n; j != s; j++);