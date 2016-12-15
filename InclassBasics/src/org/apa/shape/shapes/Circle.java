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
public class Circle extends BaseShape {

    private double radius;
    private double area;

    @Override
    public void calculateArea() {

        this.area = Math.PI * this.radius * this.radius;

    }

    @Override
    public void acceptParameterDetails() {
        System.out.println("Enter Radius:");
        radius = READER.nextDouble();
    }

    @Override
    public void displayResultDetails() {
        System.out.println("Circle area = " + area);
    }

}

