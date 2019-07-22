package day06;

class SuperClass {
	int number = 20;
}

class SubClass extends SuperClass{
	int number = 30;
	
	void accessNumber() {
		System.out.println(this.number); // this means current class
		System.out.println(super.number);
	} // end of accessNumber
}// end of SubClass

public class SuperExample{
	
	public static void main(String[] args) {
		new SubClass().accessNumber();
	}
}
