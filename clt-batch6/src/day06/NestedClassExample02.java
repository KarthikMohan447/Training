package day06;

public class NestedClassExample02 {
	
	class MyInnerClass1 {  // non-static inner class
		
		void myMethod1(){
			System.out.println("I am in MyInnerClass1 ==> myMethod1");	
	}
		
	} // end of MyInnerClass1
	
	void Access1(){
		MyInnerClass1 refMyInnerClass1 = new MyInnerClass1();
		refMyInnerClass1.myMethod1();
	}
	
	
	static class MyInnerClass2 { // static inner class 
		
		void myMethod3(){
			System.out.println("I am in MyInnerClass2 ==> myMethod3");
			
		}
	
		
		static void myMethod4() {
			System.out.println("I am in MyInnerClass2 ==> myMethod4");
		}
		
	} // end of MyInnerClass2
	
	void Access2(){
		MyInnerClass2 refMyInnerClass2 = new MyInnerClass2();
		refMyInnerClass2.myMethod3();
		MyInnerClass2.myMethod4();
		
	}
	
	void access() {
		
		class MyInnerClass3 { // method local inner class
			
			void myMethod5() {
				System.out.println("I am in MyInnerClass2 ==> access ==> myMethod5");
				
			}
			
		} // end of MyInnerClass3
		MyInnerClass3 refMyInnerClass3 = new MyInnerClass3();
		refMyInnerClass3.myMethod5();
	} // end of access

	public static void main(String[] args) {
		
		NestedClassExample02 refNestedClassExample02 = new NestedClassExample02();
		refNestedClassExample02.Access1();
		refNestedClassExample02.Access2();
		refNestedClassExample02.access();
			

	}

}
