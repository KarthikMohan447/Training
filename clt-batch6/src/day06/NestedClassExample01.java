 package day06;
 
 // nested (inner) class
 
 // a. non-static inner class
 // b. static inner class
 // c. method local inner class
 // d. anonymous inner class
 
 // example of non-static inner class
 
 class JPMorgan{
	 
	 void adminAccess() { //non static inner class
		 
		 class AdminJPMC{
			 void display() {
				 System.out.println("Hello I am in Admin..");
			 } // end of display
			 
		 } // end of AdminJPMC
		 AdminJPMC refAdminJPMC = new AdminJPMC();
		 refAdminJPMC.display();
	 } // end of adminAccess
 
	static void adminAccess2() { // static inner class
	 class FinanceJPMC{
		 void display() {
			 System.out.println("Hello I am in Finance..");
		 } // end of display
	 } // end of FiananceJPMC
		FinanceJPMC refFinanceJPMC = new FinanceJPMC();
		refFinanceJPMC.display();
 } // end of adminAccess

} // end of JPMorgan
 
 
public class NestedClassExample01 {

	public static void main(String[] args) {
		
		JPMorgan refJPMorgan = new JPMorgan();
		refJPMorgan.adminAccess();
		JPMorgan.adminAccess2();
		
		
		

	}

}
