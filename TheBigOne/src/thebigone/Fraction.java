/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebigone;

/**
 *
 * @author Edison.Morrow


/**
 
 */
public class Fraction {
    
    private final int numerator;
    private final int denominator;
    
    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }
    
    public Fraction(int numerator, int denominator) {        
        this.denominator = denominator;
        this.numerator = numerator;
    }
    
    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }
    public Boolean isZero(int numerator, int denominator) {
        if (this.denominator == 0) {
            return true;
        }
        return false;
    }
//    @Override
//    public String toString() {
//        return "Fraction{" + "numerator=" + numerator + ", denominator=" + denominator + '}';
//    }
    public static long gcm(int numerator, int denominator) {
    return denominator == 0 ? numerator : gcm(denominator, numerator % denominator); // Not bad for one line of code :)
}

public static String asFraction(int numerator, int denominator) {
    long gcm = gcm(numerator, denominator);
    return (numerator / gcm) + "/" + (denominator / gcm);
}
    @Override
    public String toString() {
        return "Fraction{"  + numerator + "/" + denominator + '}';
    }
    
    
}

