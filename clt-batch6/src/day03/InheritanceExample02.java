package day03;

class Bank{
	
	Bank(String location){
		System.out.println(location);

		}
	} // end of Bank

class DigitalBank extends Bank{
	
	DigitalBank(String location, int code) {
		super(location); // we must use super keyword to call parent class constructor
		System.out.println(code); // 1234
		// either we can print location here or we can call parent class constructor
	}
	
} // end of DigitalBank

class ChildClassofDigitalBank extends DigitalBank{
	
	ChildClassofDigitalBank(String location, int code, int password){
		super(location,code);
		System.out.println(password);
	}
	
}

public class InheritanceExample02 {

	public static void main(String[] args) {
		
		new ChildClassofDigitalBank("Digibank",1234,321);

	}

}
