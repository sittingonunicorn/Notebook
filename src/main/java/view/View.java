/**
 *Provides the classes necessary to communicate with a user.
 */

package view;

/**
 *Contains all the messages for a user and  print methods.
 */
public class View {
    /**
     * public final message to user to input his last name.
     */
    public static final String INPUT_LASTNAME = "Input last name in format ";
    /**
     * public final message to user to input his nickname.
     */
    public static final String INPUT_NICKNAME = "Input nickname in format ";
    /**
     * public final message to user about wrong input.
     */
    public static final String WRONG_INPUT = "Wrong input!";

    /**
     * Method prints single String message.
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Method concatenates 2 Strings ant prints them.
     * @param message
     * @param message2
     */
    public void printMessage(String message, String message2) {
        System.out.println(message + message2);
    }

    /**
     * Method concatenates String with integer number and prints them.
     * @param message
     * @param number
     */
    public void printMessageAndInt(String message, int number) {
        System.out.println(message + number);
    }

}