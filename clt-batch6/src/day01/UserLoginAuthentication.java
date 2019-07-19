package day01;

import java.util.Scanner;

class User
{
	
}

class AuthenticationLogic
{
	String userID, userPassword;
	boolean status;

public void userInput(String userID, String userPassword)
{
	this.userID = userID;
	this.userPassword = userPassword;
	printOut();
}
 void printOut()
{
	validateUser();
	if(validateUser()==true)
	{
    System.out.println("Welcome");
	}
	else
	{
	System.out.println("Not valid");
	}

}
public boolean validateUser()
{
	if (userID.equals("admin") && userPassword.equals("admin123"))
			{
			status=true;
			}
	else
	{
	status=false;
	}
return status;
}
}
  public class UserLoginAuthentication    
  {
	public static void main(String[] args){
		
	  Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter UserID:   ");
		String userID=sc.next();
		System.out.println("Enter User Password");
		String userPassword=sc.next();
		
		AuthenticationLogic refAL = new AuthenticationLogic();
		refAL.userInput(userID,userPassword);
		
		}
}


