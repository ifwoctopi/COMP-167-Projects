//Staci Tranquille
//1/25/2024
//Computer Program Design Section 002
//Code that prints the volume and area of a cylinder given the radius and height.

import java.util.Scanner;
import java.lang.Math;

class VariablesAssignment_1 {
  public static void main(String[] args) {
    
    Scanner scnr = new Scanner(System.in);
    System.out.print("Enter radius: ");
    double radius = scnr.nextDouble();
    System.out.print("Enter height: ");
    double height = scnr.nextDouble();
    //Input for radius and height "double" is java's version of float.

    double volume = Math.PI * Math.pow(radius, 2) * height;
    double area = 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    //Volume and area are calculated using the formula for a cylinder.
    
    System.out.printf("Volume (cubic inches): %.2f\n", volume);
    System.out.printf("Surface area (square inches): %.2f\n", area);
    
    
  
  }

  
}