/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebigone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class TheBigOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    public int inputManager(String numerator, String denominator){
        Scanner reader = new Scanner(System.in);
        String baseChar = reader.next();
        int parseController =1;
        for(int i =0; i<baseChar.length();i++){
        for( int numeratorPosition = baseChar.indexOf(""+parseController); numeratorPosition < 1; numeratorPosition=baseChar.indexOf(""+parseController++) ){
            System.out.println("The "+parseController+"th charachter has been erroneously entered");
        }
        
    if((int)baseChar.charAt(i)!=47){
        numerator += baseChar.charAt(i);
        denominator += baseChar.charAt(i);
    }else{
        denominator 
        return Integer.parseInt(numerator);
    
    }
        }
       
    }
}
