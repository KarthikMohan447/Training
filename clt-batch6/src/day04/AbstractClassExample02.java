package day04;

class A{ }

abstract class Oracle{
	abstract void driverConnection();
} // end of Oracle

abstract class Microsoft{ //Microsoft and Oracle is not aParent and Child class
	abstract void getSoftware();
} // end of Microsoft 

class MyClass  {

	void display(){
		
		Oracle refOracle = new Oracle() {

			@Override
			void driverConnection() {
				 System.out.println("Oracle Driver Connected");  // line 21
			}
		
	}; //end of Oracle
	
	refOracle.driverConnection();
	
	Microsoft refMicrosoft = new Microsoft() {

		@Override
		void getSoftware() {
			System.out.println("Microsoft Software loaded...");  // line 30
			
		}
	}; // end of Microsoft
	
	refMicrosoft.getSoftware();
} // end of display
} // end of MyClass
	
public class AbstractClassExample02 {

	public static void main(String[] args) {
		
		MyClass refMyClass = new MyClass();
		refMyClass.display();
	}

}
