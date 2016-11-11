/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment29;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Edison.Morrow
 */
public class assignment29 {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 1; i < 65535; i++) {
            list.add(new Character((char) i));
        }
        Collections.shuffle(list);
        for (int i = 0; i < 11; i++) {
            System.out.print(list.get(i));
        }
    }
}
