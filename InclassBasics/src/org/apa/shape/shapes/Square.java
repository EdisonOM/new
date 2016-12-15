/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apa.shape.shapes;

/**
 *
 * @author Edison.Morrow
 */
public class Square extends BaseShape {

    private double lengthOfSide;
    private double area;

    @Override
    public void calculateArea() {
        this.area = this.lengthOfSide * this.lengthOfSide;
    }

    @Override
    public void acceptParameterDetails() {
        System.out.println("Enter a square side: ");
        lengthOfSide = READER.nextDouble();
    }

    @Override
    public void displayResultDetails() {
        System.out.println("Square area = " + area);
    }
}
