/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edison.Morrow
 */
public class assignment11 {

    public static void main(String[] args) {
        List<Integer> theList = new ArrayList();
        theList.add(1);
        theList.add(5);
        theList.add(4);
        theList.add(3);
        theList.add(7);
        for (int s : theList) {
            System.out.println(s);
        }
    }
}
