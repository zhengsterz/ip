package red.ui;

import java.util.Scanner;

/**
 * This class functions facilitates interaction between the user and the program.
 */
public class UI {

    private static Scanner scanner;
    private StringBuilder redReply = new StringBuilder();

    /**
     * Sends a greeting to the user.
     */
    public void sayHello() {
        System.out.println("Red is ready to assist you\n");
    }

    /**
     * Processes the user input and returns it as a String
     *
     * @return user input in a String format.
     */
    public String readCommand() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    /**
     * Prints out a line to separate statements for readability
     */
    public void showLine() {
        System.out.println("********************************************");
    }

    /**
     * Prints out the error message.
     * @param err The error message.
     */
    public void showError(String err) {
        System.out.println("Error Message String = " + err);


    }


    /**
     * Removes any words from redReply making it ready to except new replies
     */
    public void clear() {
        this.redReply = new StringBuilder();
    }

    /**
     * Returns the replies from the tasks we run
     */
    public String getCurrentReply() {
        return String.valueOf(this.redReply);
    }

    /**
     * Adds the replies from the tasks we run to redReply
     */
    public void addCurrentReply(String reply) {
        this.redReply.append(reply);
    }
}