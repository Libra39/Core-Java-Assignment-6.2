package Assignment_6;												// Package Declared
@SuppressWarnings("serial")
public class NegativeAgeException extends Exception {				// Class declared which inherits Exception Java class 
	String errorMessage;											// string variable declared	
	public NegativeAgeException(String errorMessage){				// method declared
	this.errorMessage = errorMessage;}								// this keyword is used to distinguish between class and instance variables
	
	@Override														// Method overriding
	public String toString() {										//Modifying toString() method to display customized error message
	return errorMessage;}
}																	// class NegativeAgeException closed

