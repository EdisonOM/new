/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rationalnumberadder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class RationalNumberAdder {

  
    public static void main(String[] args) {
        boolean slashTester = true;
        List<Character> baseChar = new ArrayList();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your rational number: ");
        String str = reader.next();
        for (int i = 0; i != str.length(); i++) {
            char a_char = str.charAt(i);
            baseChar.add(a_char);
        }
    for (int i = 0; i != baseChar.size() && !Objects.equals(baseChar.get(i), "/"); i++) {
            
        }
    }
    
}
