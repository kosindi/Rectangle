/*
 * Kowar Sindi
 * February 23 2015
 * This program asks the user to enter the height and width of a rectangle and it outputs
 * the perimeter and area of the rectangle based of the user input. 
 */

import java.util.Scanner;
import java.text.DecimalFormat;


public class Rectangle {
	public static void main(String[] args) {
		System.out.println("Hello, enter the height of a rectangle.");//asks user to enter the height 
		double height, width, perimeter, area;//variables stored as doubles
		DecimalFormat A = new DecimalFormat("0.00");//to round the decimal to 2 decimal places
		Scanner keyboard = new Scanner (System.in); //reads keyboard input
		height = keyboard.nextDouble();//the height that the user enters
		System.out.println("Now enter the width of a rectangle.");//asks user to enter the width
		width = keyboard.nextDouble();//width the user enters 
		perimeter = (height*2) + (width*2);//formula for perimeter
		area = height * width;//formula for area
		System.out.println("The perimeter of the rectangle is " + A.format(perimeter) + "," +
							"\nand the area of the rectangle is " + A.format(area) + ".");//output
		keyboard.close();//closes the keyboard to prevent a resource leak
		
	}

}