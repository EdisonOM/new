/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment30 {
    
    public static void main(String[] args) {
        int i;
        List<Character> theList = new ArrayList();
        List<Integer> theList2 = new ArrayList();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your string: ");
        String username = reader.next();
        for (i = 0; i < username.length(); i++) {
            
            char a_char = username.charAt(i);
            
            theList.add(a_char);
        }
        for (i = 0; i < theList.size(); i++) {
            int ascii =10+ (int) theList.get(i);
            theList2.add(ascii);
        }
    }
}
