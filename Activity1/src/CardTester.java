/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
	Card aceOfSpades = new Card("ace", "spades", 1);
        Card queenOfHearts = new Card("queen", "hearts", 10);
        Card kingOfHearts = new Card ("king", "hearts",10);;
        aceOfSpades.matches(kingOfHearts);
        }
}
