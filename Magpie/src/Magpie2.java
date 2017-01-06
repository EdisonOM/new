
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 * Uses indexOf to find strings
 * </li><li>
 * Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 *
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {

    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";
        if (statement.equals("no")) {
            response = "Why so negative?";
        } else if (statement.equals("mother")
                || statement.equals("father")
                || statement.equals("sister")
                || statement.equals("brother")) {
            response = "Tell me more about your family.";
        } else if (statement.equals("dog")
                || statement.equals("cat")) {
            response = "tell me more about your pets";
        } else if (statement.equals("Dr.Jones")) {
            response = "He sounds like a good teacher";

        } else if (statement.equals(" ")) {
            response = "Say something, please";

        } else if (statement.equals("yes")) {
            response = "Why so Positive?";

        } else if (statement.equals("maybe")) {
            response = "ok";

        } else if (statement.equals("ok")) {
            response = "Why so neutral?";

        } else {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {
            response = "ok";
        } else if (whichResponse == 5) {
            response = "so?";
        }
        return response;
    }
}
