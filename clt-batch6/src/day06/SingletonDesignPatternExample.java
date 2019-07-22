package day06;

// DBConnection Class would be our Singleton Class
class SingletonClass {
	
	private static SingletonClass ref;
	
	private SingletonClass(){ //private constructor
	        System.out.println("hello");
}

public static SingletonClass getMethod() {
	if (ref==null){
		ref = new SingletonClass();
	}
	return ref;
} //end of getMethod

} // end of SingletonClass

public class SingletonDesignPatternExample {

	public static void main(String[] args) {
		SingletonClass.getMethod();
		SingletonClass.getMethod();
		SingletonClass.getMethod();
		SingletonClass.getMethod();

	}

}
