import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
     * @param args
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		List<Character> baseChar = new ArrayList();
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String priorStatement = in.nextLine();
		for(int x = 1; x < priorStatement.length();){
                    String a_char = ""+priorStatement.charAt(x); 
                    for(String f =""; !f.equals(a_char); x++ ){
                        baseChar.add(priorStatement.charAt(x));
                    }
                }
                String statement = "";
               for(int i = 0; i!= baseChar.size();i++){
                   statement += ""+baseChar.get(i);
               }
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
