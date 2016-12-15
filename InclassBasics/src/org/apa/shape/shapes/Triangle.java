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
public class Triangle extends BaseShape {

    private double heigth;
    private double lengthOfBase;
    private double area;

    @Override
    public void calculateArea() {

        area = 0.5 * this.lengthOfBase * this.heigth;

    }

    @Override
    public void acceptParameterDetails() {
        System.out.println("Enter a height: ");
        double heigth = READER.nextDouble();
        System.out.println("Enter a base: ");
        double lengthOfBase = READER.nextDouble();
    }

    @Override
    public void displayResultDetails() {
        System.out.println("Triangle area = " + area);
    }
}
