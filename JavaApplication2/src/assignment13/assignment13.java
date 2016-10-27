/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment13;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edison.Morrow
 */
public class assignment13 {
    public static void main(String[] args) {
        List<Integer> theList = new ArrayList();
        theList.add(1);
        theList.add(5);
        theList.add(4);
        theList.add(3);
        theList.add(8);
        theList.add(9);
        theList.add(10);
        theList.add(21);
        theList.add(72);
        theList.add(-12);
    int i;
    int p;
double sum = 0;
for(i = 1; i < theList.size(); i++)
    sum += theList.get(i);
double l = sum/i; 
System.out.println(sum);
System.out.println(l);
for(p = 1; p < theList.size(); p++)
    sum += theList.get(p)*theList.get(p);
System.out.println(sum);
    }
}
