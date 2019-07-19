package day04;

final class Parent {
	
}

abstract class Visa{ // Parent class
	
	abstract void login1(); // abstract method without a body, ends with a  semicolon
	abstract void login2();
	abstract void login3();
	// if we declare any abstract method in a abstract class, we must define in its sub class
	
	void logout(){
		//method with a body
		
	}// end of logout
	
} // end of Visa

class HSBC extends Visa{ // HSBC--> Child class

	@Override
	void login1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void login2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void login3() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class AbstractClassExample01 {

	public static void main(String[] args) {
		

	}

}
