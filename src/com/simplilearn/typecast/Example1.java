package com.simplilearn.typecast;

import java.util.Scanner;


public class Example1 {

	public static void main(String[] args) {
		// WAP for converting int , byte , short => float , double , long.
		
		Scanner input=new Scanner(System.in);
		int userInput=input.nextInt();
		
		float floatValue= userInput;
		double doublevalue=userInput;
		long longvalue = userInput;
		
	System.out.println("Converterted Value");
	System.out.println("Float value : "+floatValue);
	System.out.println("Double value : "+doublevalue);
	System.out.println("Long value : "+longvalue);
	}

}
