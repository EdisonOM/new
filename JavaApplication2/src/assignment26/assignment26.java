/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment26;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Edison.Morrow
 */
public class assignment26 {

    public static void main(String[] args) {
        int i;
        List<String> theList = new ArrayList();
        List<String> theList2 = new ArrayList();
        List<Integer> theList3 = new ArrayList();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your string: ");
        String username = reader.next();
        theList.add(username);
        Matcher m = Pattern.compile("$").matcher(username);
        m.find();
        int length = m.end();
        for (i = 0; i < username.length(); i++) {
            char a_char = username.charAt(i);
            String letter = Character.toString(a_char);
            theList2.add(letter);
            System.out.println(theList2.get(i));
            Random rand = new Random();
            int n = rand.nextInt(length) + 1;
            theList3.add(n);
            for (n = rand.nextInt(length) + 1; n != theList3.get(length) && length > 0; length--) {
                theList3.remove(n);
            }

        }
    }
}
