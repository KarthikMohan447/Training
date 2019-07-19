package day04;

// interface is a fully abstract class

interface Bank {
	void deposit();
	abstract void withdraw();
	void checkBalance();
	// int code; // we cant declare like this, compilation error
	final static int code = 204050; // we have to declare variable value, by default it is final and static
	
} // end of Bank

interface UserLoginCredential {
	void userLogin();
	void userLogout();
} // end of UserLoginCredential

// functional interface : Java 1.8 version onwards

@FunctionalInterface
interface SingleMethod { // functional interface cant have more than one abstract method
	void method();
	
} //end of SingleMethod

// Java 1.8 new feature --> default method in interface
interface DefaultMethod extends SingleMethod {
	default public void myMethod() {
		System.out.println("from Java 1.8 version can have method with a body");
}
}

class CitiBank implements Bank, UserLoginCredential {

@Override
public void deposit() {
	// TODO Auto-generated method stub
	
}

@Override
public void withdraw() {
	// TODO Auto-generated method stub
	
}

@Override
public void checkBalance() {
	// TODO Auto-generated method stub
	
} // Java supports Multiple Inheritance by using Inheritance
}
public class InterfaceExample01 {
	

	public static void main(String[] args) {
	
		System.out.println(Bank.code);
	}

}
