package day02;

import java.util.Scanner;

public class UserApplication {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		
		String userID = sc.next();
		
		System.out.println("Enter the password");
		
		String userPassword = sc.next();
		
		System.out.println("Enter the Age");
		
		int userAge = sc.nextInt();
		
		User refUser = new User();
		
		refUser.setAge(userAge);
		refUser.setUserID(userID);
		refUser.setUserPassword(userPassword);

	System.out.println(refUser.getAge()+" "+refUser.getUserID()+" "+refUser.getUserPassword());
	}

}
