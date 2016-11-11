/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edison.Morrow
 */
public class assignment14 {

    public static void main(String[] args) {
        List<Integer> theList = new ArrayList();
        theList.add(1);
        theList.add(-5);
        theList.add(4);
        theList.add(3);
        theList.add(-8);
        theList.add(9);
        theList.add(10);
        theList.add(-21);
        theList.add(72);
        theList.add(-12);
        int i;
        int numberOfnumbers = 0;
        double sum = 0;
        double sqr = 0;
        double average;
        int maybePositive;

        for (i = 0; i < theList.size(); i++) {
            maybePositive = theList.get(i);
            if (maybePositive > -1) {

                sum += theList.get(i);
                sqr = Math.sqrt(maybePositive);
                System.out.println(sqr);
                numberOfnumbers++;
            }
            
        }
        average = sum / numberOfnumbers;
        System.out.println(sum);

        System.out.println(average);

    }
}
