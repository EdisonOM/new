/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment36;

import javax.swing.JOptionPane;

/**
 *
 * @author Edison.Morrow
 */
public class assignment36 {

    public static void main(String[] args) {
        String[] choices = {"Distance away from number", "High of Low",};
        String algore = (String) JOptionPane.showInputDialog(null, "What's the "
                + "color of the circle?", "Color", JOptionPane.QUESTION_MESSAGE,null,choices,choices[1]);
        if (algore.equals("Distance away from number")){
            
        }
 if (algore.equals("High of Low")){
            
        }
    }
}
