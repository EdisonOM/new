/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author SomeDude
 */
public class assignment26 {
    
    public static void main(String[] args) {
        List<Character> theList = new ArrayList();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your string: ");
        String username = reader.next();
        for (int i = 0; i != username.length(); i++) {
            
            char a_char = username.charAt(i);
            System.out.println(a_char);
            theList.add(a_char);
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i != theList.size(); i++) {
            list.add(new Integer((int) i));
        }
        Collections.shuffle(list);
        for (int p = 0; p != theList.size(); p++) {
            System.err.println(theList.get(list.get(p)));
        }
    }
}
