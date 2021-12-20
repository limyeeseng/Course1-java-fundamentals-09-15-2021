package com.simplilearn.typecast;

import java.util.Scanner;

public class NumericDataConverter {

	public static void main(String[] args) {
		// step 1 collect input from user console
		Scanner input=new Scanner(System.in);
		System.out.println("----------------------");
		System.out.println(" :: Welcome to numeric converter :: ");
		System.out.println(" :: Enter a integer number value :: ");
		System.out.println("----------------------");
		int userInput = input.nextInt();
		System.out.println("User Input :"+userInput);
		
		
		// step 2 convert user input into different numeric type
		// implicit type cast
		long bigValue = userInput;
		float floatValue = userInput;
		double doubleValue = userInput;
		
		// explicit type cast
		byte byteValue = (byte) userInput;
		short shortValue=(short) userInput;
		
		System.out.println("Convereted value : ");
		System.out.println("Byte value :"+byteValue);
		System.out.println("Short value : "+shortValue);
		System.out.println("Long value : "+bigValue);
		System.out.println("Float value : "+floatValue);
		System.out.println("Double value : "+doubleValue);
	}

}
