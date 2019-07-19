package day02;

public class MethodOverloadingExample {

	public static void main(String[] args) {	// Step 1 - execution starts here
		System.out.println("Class loader loads this main..");
		main(20);	// Step 2
		System.out.println("Final Print");	// Step 8
	}	// end of main
	
	public static void main(int number){ // Step 3
		main("data");	// Step 4
		System.out.println(number);	// Step 7
		
	}	// end of main
	
	public static void main(String reference){	// Step 5
		System.out.println(reference);	// Step 6
		
	}	//end of main

}	// end of MethodOverloadingExample class
