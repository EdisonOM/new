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
public class TheBigRunner {
    public static void main(String[] args) {
        
        Putin inputManager = new Putin();
        inputManager.displayInstructions();
        inputManager.scanner();
        Fraction answer = inputManager.getAnswer();
        putOut outputManager = new putOut();
        outputManager.output(answer);

        
    }
    
}

