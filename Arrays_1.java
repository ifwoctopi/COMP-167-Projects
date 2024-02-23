/*
Staci Tranquille
2/19/2024
Computer Program Design Section 002
Given an initial number for array size and succeeding numbers, this code prints the numbers with the first
and last numbers switched.
 */

import java.util.Scanner;

public class Arrays_1 {

    static Scanner scnr = new Scanner(System.in);


    private static void getArrayValues(int[] vArray) {


        int num;

        //Adding input numbers to list given in the parameter
        for (int i = 0; i < vArray.length; i++) {
            System.out.print("Enter the the integer value for index [" + i + "]: ");
            num = scnr.nextInt();
            System.out.print("\n");
            vArray[i] = num;
        }

    }
    //You have to declare the type of parameter when creating the function
    private static void swapMe(int[] swap) {
        /*
        Made a copy of the swap array, so I could switch the indexes of the numbers without altering
         the original array
        */
        int[] copy = new int[swap.length];
        System.arraycopy(swap, 0, copy, 0, swap.length);
        copy[(copy.length - 1)] = swap[0];
        copy[0] = swap[swap.length - 1];
        for (int j : copy) {
            System.out.print(j + " ");
        }
    }
    public static void main(String[] args) {
        /*
         Note: You can have getArrayValues return an array instead of void. You would just put int[]
         where void is. However... to understand methods we returned void and used the getArrayValues method
         to update the array
        */



        //Getting the size of the array
        System.out.print("Enter the number of elements to enter: ");

        int arraySize = scnr.nextInt();
        System.out.print("\n");

        //Creating a new array of the given size to fulfill getArrayValues' parameter
        int[] userValues = new int [arraySize];

        getArrayValues(userValues);
        swapMe(userValues);
    }
}
