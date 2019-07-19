package day01;

public class Customer {
	
	int age;
	String NRIC;
	
	void customerDetails(int age, String NRIC)
	{
	System.out.println(age);
	System.out.println(NRIC);
	}

    public static void main(String[] args)
    {
    Customer refCustomer = new Customer();
    refCustomer.customerDetails(25,"S9472295J");
    }
}
