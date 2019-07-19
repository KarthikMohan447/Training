package day02;

public class JVMDemo {
		int number1 = 20;
		String reference = "data";
	
	void displayNumber(){
		System.out.println(number1);
	}
	
}

public class MyClass{
	
	public static void main(String[] args){
		
		JVMDemo refJVMDemo = new JVMDemo();
		refJVMDemo.displayNumber();
		System.out.println(refJVMDemo.reference);
		refJVMDemo = null;
	}
}
