/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thebigone;

/**
 *
 * @author Edison.Morrow
 */
public class Meth {

    public static Fraction add(Fraction f1, Fraction f2) {

        if (f1.getDenominator() != f2.getDenominator()) {
            throw new IllegalArgumentException("I am really sorry - but they did not pay me enough to add fractions with different denominators.  I have since been fired from my job and no longer work here.  I am a good person.");
        }

        int resultNumerator = f1.getNumerator() + f2.getNumerator();
        int resultDenominator = f1.getDenominator();

        return new Fraction(resultNumerator, resultDenominator);

    }

}
