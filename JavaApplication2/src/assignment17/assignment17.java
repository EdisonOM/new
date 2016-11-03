/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment17;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Edison.Morrow
 */
public class assignment17 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your string: ");
        String username = reader.next();
        Matcher m = Pattern.compile("$").matcher(username);
        m.find();
        int length = m.end();
        String result = username.substring(0, length).toUpperCase();
        String result1 = username.substring(0, length).toLowerCase();
        System.out.println(result);
        System.out.println(result1);
    }
}
