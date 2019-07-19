package day03;

class Parent{}
class Child extends Parent{}

public class TypeCastingExample {
    
	int num1 = 10;
	long num2 = num1; // implicit casting, JVM doesit
	
	long num3 = 500;
	int num4 = (int) num3; // we need to add cast, explicit casting
	
	// Up Casting and Down Casting
	String ref1 = "Java";
	// Object is a super class (roor class) of all the classes in Java
	Object ref2 = ref1; // up casting
	
	Parent refParent = new Child(); // 
	public static void main(String[] args) {
	

	}

}
