package day02;

class Mobile{
	
	int price = 500;

	// JVM creates a default constructor of Mobile class
	// constructor came and class name must be same
	// constructor doesnt have any return type, not even void
	
	Mobile(){	// default constructor
		System.out.println(price);
	}		// end of Mobile constructor

	// verb /action ==> method
	// method always have some return type or void (no return type)

}   //end of Mobile class

public class ConstructorExample {

	public static void main( String[] args){
		new Mobile();
	}
}
