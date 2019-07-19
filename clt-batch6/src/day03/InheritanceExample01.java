package day03;

class MasterCard{
	static void loginAuthentication1() {
		System.out.println("I am in MasterCard -> loginAuthentication1");
	}
    void loginAuthentication2()  {
    	System.out.println("I am in MasterCard -> loginAuthentication2");
    }
} // end of MasterCard

class DBSBank extends MasterCard{
	
	static void loginAuthentication1() {
		System.out.println("I am in DBSBank -> loginAuthentication1");
	}
	void loginAuthentication2() {
		System.out.println("I am in DBSBank -> loginAuthentication2");
	}
} // end of DBSBank

public class InheritanceExample01 {

	public static void main(String[] args) {
		
		MasterCard ref = new DBSBank(); // up casting
        // DBSBank ref = new MasterCard(); // down casting
		ref.loginAuthentication1(); // parent class static will get called
		ref.loginAuthentication2(); // child class non-static will get called
	}

}
