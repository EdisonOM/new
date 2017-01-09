
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 *
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2 {

    /**
     * Create a Magpie, give it user input, and print its replies.
     *
     * @param args
     */
    public static void main(String[] args) {
        String priorStatement;
        int x;
        String statement;//creates placeholder for statement
        Magpie2 maggie = new Magpie2();//makes a realization of magpie 2 
        List<String> baseChar = new ArrayList();//creates arraylist baseChar
        List<String> statements = new ArrayList();//Creates arraylist statements
        System.out.println(maggie.getGreeting());//uses method of magpie 2 to return and print an introductory statement to console
        Scanner in = new Scanner(System.in);//makes a realization of the scanner class
        priorStatement = in.nextLine();// pulls input from the scanner "in"
        String a_char;//creates a string named a_char.
        while (!priorStatement.equals("Bye")) {//ensures that the entered statement is not "Bye", in which case the program will end.
            int moderator = priorStatement.length();//creates an integer named moderator that is set to the number of characters pulled from console in "priorStatement".
            for (x = 0; x < moderator;) {//facilitates the reset of variable "statement" and list "baseChar" whilist ensuring that the word-assembling loop array does not exit after word one of the entered phrase.
                statement = "";//sets string "statement" to nothing as to clear the relative output-placeholder buffer that is string "statement" in preperation for the loops next iteration.
                a_char = "" + priorStatement.charAt(x);//sets a_char to whatever letter is located at the integer-described position of x.
                for (String f = " "; !f.equals(a_char) && x < moderator; x++) {//diffrentiates words of entered phrase through spaces as to ensure that every assembly of characters is passed and considered individually.
                    a_char = "" + priorStatement.charAt(x);//allows a_char to be reset to whatover x is iterated to.
                    baseChar.add(a_char);//stores a_char in list baseChar.
                }
                for (int i = 0; i < baseChar.size(); i++) {//iterates over the contents of baseChar as to allow its contents to be assembled
                    statement = statement + baseChar.get(i);//assembles words
                }
                statements.add(statement);//adds the assembled statement to list statements.                
                System.out.print(maggie.getResponse(statement, priorStatement, x));//procures appropriate response from magpie2 based on assembled words
                baseChar.clear();//clears buffer list "baseChar"

            }
            priorStatement = in.nextLine();//accepts new phrase from console.
        }

    }
}
