/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edison.Morrow
 */
public class assignment12 {

    public static void main(String[] args) {
        int[] arrayOfIntegers = {1, 5, 4, 3, 7};
        List<Integer> theList = new ArrayList();
        

        for (int s : arrayOfIntegers) {
            theList.add(s);

        }
        System.out.println(theList);

    }
}
