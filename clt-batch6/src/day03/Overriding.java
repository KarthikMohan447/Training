// inheritance

// Parent/ Base/Super and Child/Derived/Sub

// Visa is Parent class

package day03;

class Visa{
	
	void ageLimit(){	// Visa follows rule=> User cant apply for credit card, if age 18
		System.out.println("Age should not be less than 18");
		
	}
	
	// within a class, same method name, parameter different, return type can be different 
	int ageLimit(int number){	// method Overloading
		return 0;
	}
}	// end of Visa

// here CitiBank is child class
class CitiBank extends Visa{	// we use extends keywords to call Parent class from Child
	
      //In inheritance, child class override method of parent class
      //method name same, parameter same, return type must be same
      @Override	//we must give @Override before the method name
	int ageLimit(int number){	// method overriding ==> line number 17
		return 0;
	}
	 
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
