/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public class assignment31 {

    public static void main(String[] args) {
        int i;
        int p;
        int s;
        int x;
        int coder = 32;
        int coderValue = 127;

        List<Character> baseChar = new ArrayList();
        List<Integer> greaterThanCoderValue = new ArrayList();
        List<Integer> diffBetweenCodedAsciiAndCoderValue = new ArrayList();
        List<Integer> decodedAsciiList = new ArrayList();
        List<Integer> lessThanCoderValue = new ArrayList();
        List<Integer> encodedSequence = new ArrayList();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter your string: ");
        String username = reader.next();
        for (i = 0; i != username.length(); i++) {
            char a_char = username.charAt(i);
            baseChar.add(a_char);
        }
        for (p = 0; p != baseChar.size(); p++) {
            int codedAscii = 10 + (int) baseChar.get(p);
            lessThanCoderValue.add(codedAscii);
            encodedSequence.add(codedAscii);
            if (codedAscii > coderValue) {
                lessThanCoderValue.remove(codedAscii);
                encodedSequence.remove(codedAscii);
                lessThanCoderValue.add(-1);
                encodedSequence.add(coder + codedAscii - coderValue);
                greaterThanCoderValue.add(coder + codedAscii - coderValue);
                diffBetweenCodedAsciiAndCoderValue.add(codedAscii - coderValue);
            }
        }
        System.out.println(encodedSequence);
        for (s = 0; s != lessThanCoderValue.size(); s++) {
            decodedAsciiList.add(lessThanCoderValue.get(s) - 10);
            if (lessThanCoderValue.get(s) == -1) {
                decodedAsciiList.remove(lessThanCoderValue.get(s) - 10);
                decodedAsciiList.add(greaterThanCoderValue.get(s) - diffBetweenCodedAsciiAndCoderValue.get(s) - 10);
            }
        }
        System.out.println(decodedAsciiList);
        for (x = 0; x != decodedAsciiList.size(); x++) {
            String decoded = String.valueOf(Character.toChars(decodedAsciiList.get(x)));
            System.out.println(decoded);
        }
    }
}
