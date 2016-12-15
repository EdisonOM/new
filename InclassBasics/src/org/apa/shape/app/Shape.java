/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apa.shape.app;

import org.apa.shape.shapes.BaseShape;

/**
 *
 * @author Edison.Morrow
 */
public class Shape {

    public static void main(String[] args) {
        Menue menue = new Menue();
        BaseShape shape = menue.getShape();
        shape.acceptParameters();
        shape.calculateArea();
        shape.displayResults();
    }

}

   