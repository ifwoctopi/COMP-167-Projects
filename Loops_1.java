//Staci Tranquille
//2/12/2024
//Computer Program Design Section 002
//Code that prints the number of matching characters in two user input words.

import java.util.Scanner;



public class Loops_1 {
    public static void main(String[] args) {
        //Input Block
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String stringA = scnr.next();
        System.out.print("\nEnter second string: ");
        String stringB = scnr.next();

        //Variable Declaration
        int matches = 0;

        // Syntax for splitting string into a list of characters
        String[] stringA_array = stringA.split("");
        String[] stringB_array = stringB.split("");

        //Loop Block
        //Loops have their own local variables that cannot be used outside the loop
        //To use variables outside the loop the variable must be initialized outside the loop

        //*Future Ref* Had to check that string contains the same letters and that the matching letters were at
        //the same index.

        if (stringA.length() < stringB.length()) {
            for (int i = 0; i < stringA_array.length; i++){
                if (stringA_array[i].equals(stringB_array[i])) {
                    matches = matches + 1;
                }

            }
        }
        else if (stringB.length() < stringA.length()) {
            for (int i = 0; i < stringB_array.length; i++){
                if (stringB_array[i].equals(stringA_array[i])) {
                    matches = matches + 1;
                }
            }
        }
        else {
            for (int i = 0; i < stringA_array.length; i++){
                if (stringA_array[i].equals(stringB_array[i])) {
                    matches = matches + 1;
                }
            }
        }

            //Conditional Statement for Output Format
            if (matches == 1) {
                System.out.println("\n" + matches + " character matches");
            } else {
                System.out.println("\n" + matches + " characters match");
            }

        }

    }





