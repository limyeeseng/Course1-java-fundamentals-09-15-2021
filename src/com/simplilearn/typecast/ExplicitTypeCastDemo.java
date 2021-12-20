package com.simplilearn.typecast;

public class ExplicitTypeCastDemo {
	
	public static void main (String[] args) {
		// Explicit typeCast : does not happen automatically
		/**
		 * Narrowing : Converts data of incompatible type Convert data from higher range
		 * value to lower range value. double => float => long => int => short => byte.
		 */
		double price = 100.77d;
		long bigPrice =(long) price; 	// narrowing => double -> long
		int intPrice = (int) bigPrice;  // narrowing => long -> int
		short shortPrice = (short)bigPrice;  // narrowing => long -> short
		byte bytePrice = (byte) price; // narrowing => double -> byte 
		
		System.out.println("Double Price : " + price);
		System.out.println("Long price : " + bigPrice);
		System.out.println("Short price: " + shortPrice);
		System.out.println("Integer Price : " + intPrice);
		System.out.println("Byte Price : " + bytePrice);
		
	}

}
