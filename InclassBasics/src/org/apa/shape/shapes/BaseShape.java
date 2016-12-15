/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apa.shape.shapes;

import java.util.Scanner;

/**
 *
 * @author Edison.Morrow
 */
public abstract class BaseShape {

    protected final static Scanner READER = new Scanner(System.in);

    public abstract void calculateArea();

    public abstract void acceptParameterDetails();

    public abstract void displayResultDetails();

    public void acceptParameters() {
        System.out.println("Please stay in equal units.");
        this.acceptParameterDetails();
    }

    public void displayResults() {
        this.displayResultDetails();
        System.out.println("Thank You");
    }
}
