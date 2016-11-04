/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment20 {

    public static void main(String[] args) {
        List<String> theList = new ArrayList();
        int i;

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your string: ");
        String username = reader.next();
        for (i = 0; i < username.length(); i++) {

            char a_char = username.charAt(i);
            String letter = Character.toString(a_char);
            theList.add(letter);

            System.out.println(theList.get(i));
        }

    }
}
