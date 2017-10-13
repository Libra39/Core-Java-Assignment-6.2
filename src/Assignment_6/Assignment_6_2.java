package Assignment_6;																		// Package Declared
import java.util.Scanner;																	// Scanner class declared
/**
 * Write a program to generate a user-defined exception called NegativeAgeException if the user inputs negative value for age.
 * Generating NegativeAgeException if user inputs negative value for age.
 * 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 */

public class Assignment_6_2 {																// Class declared
	public static Scanner sc = new Scanner(System.in);										// Declaring Scanner variable to take input from user
	public static void main(String[] args) {												// Main method started
		System.out.print("Enter Your Age : ");												// Print statement
		int age = sc.nextInt();         													// Taking input from user
			try																				// Try block
				{ if(age < 0)																// if condition
					{ throw new NegativeAgeException("Age Can't be Negative"); }   			// throws an Exception if age is negative
				}																			// try block closed
			catch(NegativeAgeException ex){													// catch statement
	System.out.println(ex); }  																// Prints exception description																	
	}																						// main method closed
}																							// class Assignment_6_2 closed
