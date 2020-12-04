/*
*Author: Collin Leonard
* Date: 11/24/20
* The purpose of this program is to manipulate the string entered (the name)
* and display each piece of the full name according to which part of the name it is (first, middle, last).
 */

// Import Scanner class for user input.
import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        // Create Scanner object.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        // Scanner object used to assign input to String variable name
        String name = sc.nextLine();
        System.out.println();
        // trim() method used to remove leading and trailing spaces in string.
        name = name.trim();
        // gets index of first space in string and uses it for if statements.
        int spaceOne = name.indexOf(" ");
        if (spaceOne == -1) {
            // Display error for invalid name.
            System.out.println("Error! Invalid name entered.");
        }
        else {
            // Calculate how many names are entered using indexOf searching for spaces.
            int spaceTwo = name.indexOf(" ", spaceOne + 1);
            if (spaceTwo == -1) {
                // Grab each piece of the name using substring method.
                String firstName = name.substring(0, spaceOne);
                String lastName = name.substring(spaceOne + 1);
                // Format string and output it.
                String output = "First name: " + firstName + "\nLast name: " + lastName;
                System.out.println(output);
            }
            else {
                // Calculate to see if there are three names using indexOf
                int spaceThree = name.indexOf(" ", spaceTwo + 1);
                if (spaceThree == -1) {
                    // Grab each piece of the name using substring method.
                    String firstName = name.substring(0, spaceOne);
                    String middleName = name.substring(spaceOne + 1, spaceTwo);
                    String lastName = name.substring(spaceTwo + 1);

                    // Format and output string.
                    String output = "First name: " + firstName + "\nMiddle name: " + middleName + "\nLast name: " + lastName;
                    System.out.println(output);
                }
                else {
                    // Display error for invalid name.
                    System.out.println("Error! Invalid name entered.");
                }
            }
        }
    }
}
