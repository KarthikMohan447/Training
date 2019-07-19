package day02;

class Laptop{
	
	Laptop() {
		this(30);
		System.out.println("Hello I am in default constructor");
	}

	Laptop(int price){
		this(30,"Apple");
		System.out.println(price);
	}
	
	Laptop(int price, String brand) {
			
			System.out.println(price+" "+brand);
	}
}	// end of the class Laptop

public class ConstructorChainingExample {

	public static void main(String[] args) {
		
		new Laptop();
		

	}

}
