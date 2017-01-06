
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

    static String priorStatement;
    static int x;

    /**
     * Create a Magpie, give it user input, and print its replies.
     *
     * @param args
     */
    public static void main(String[] args) {
        String statement = "";
        Magpie2 maggie = new Magpie2();
        List<String> baseChar = new ArrayList();
        System.out.println(maggie.getGreeting());
        Scanner in = new Scanner(System.in);
        priorStatement = in.nextLine();

        while (!statement.equals("Bye")) {
            for (x = 0; x < priorStatement.length();) {
                String a_char = "" + priorStatement.charAt(x);
                for (String f = " "; !f.equals(a_char) && x < priorStatement.length(); x++) {
                    a_char = "" + priorStatement.charAt(x);
                    baseChar.add(a_char);
                    a_char = "" + priorStatement.charAt(x);
                }
                for (int i = 0; i < baseChar.size(); i++) {
                    statement = statement + baseChar.get(i);
                }

                System.out.println(maggie.getResponse(statement));
                baseChar.clear();
                statement = "";
            }
            priorStatement = in.nextLine();
        }

    }

    public static String getStatement() {
        return priorStatement;
    }

    public static Integer getLength() {
        return x;
    }

}

