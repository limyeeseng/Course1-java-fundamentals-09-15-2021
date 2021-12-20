package com.simplilearn.accessmodifiers;

public class DefaultAccessModifierDemo {

	public static void main(String[] args) {
		// create a object
		House house = new House();
		System.out.println("The House : "+house.name);
		System.out.println("The TV :"+house.tv);
		System.out.println("The Member count : "+house.houseMates);
		System.out.println("-------------");
		// access methods
		System.out.println(house.showTV());
		house.showBed();
		System.out.println(house.showHouseMatesCount());
	}

}

class House {
	// no access modifier or default
	String name = "King House";
	String tv = "LG TV";
	int houseMates = 5;
	
	//default methods
	String showTV() {
		return tv;
	}
	void showBed() {
		System.out.println("The House is "+name);
	}
	int showHouseMatesCount() {
		return houseMates;
	}
	
}