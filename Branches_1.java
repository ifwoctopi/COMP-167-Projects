//Staci Tranquille
//2/7/2024
//Computer Program Design Section 002
//Code that prints the speeding ticket amount given the speed limit and the user's speed.

import java.util.Scanner;

public class Branches_1 {
    public static void main(String[] args) {

        //Input Block/ Variable Declaration
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter speed limit: ");
        int speedLimit = scnr.nextInt();
        System.out.print("Enter speed: ");
        int speed = scnr.nextInt();
        int speed_diff = speed - speedLimit;

        //if - else statements (switches only rly work when you're expecting a specific set
        // of answers)

        if (speed_diff <= -10) {
            System.out.println("\nThe ticket cost is: $50.00");
        }
        else if (speed_diff <= 20 && speed_diff >= 6) {
            System.out.println("\nThe ticket cost is: $75.00");
        }
        else if (speed_diff <= 40 & speed_diff >= 21) {
            System.out.println("\nThe ticket cost is: $150.00");
        }
        else if (speed_diff > 40) {
            System.out.println("\nThe ticket cost is: $300.00");
        }

        else {
            System.out.println("\nThe ticket cost is: $0.00");
        }


    }
}
