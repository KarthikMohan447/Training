package day05;

import java.util.Scanner;

public class MobileApplication {

	public static void main(String[] args) {
		
		// Step 1: Create object 
		Mobile refMobile= new Mobile();
		WhatsApp refWhatsApp = new WhatsApp();
		Chat refChat = new Chat();
		
		// Step 2
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your text:");
		String myText = sc.next();
		
		refChat.setRefMobile(myText);  // this argument will set the value to setter method in chat class
		refMobile.setRefWhatsApp(refWhatsApp);
		refWhatsApp.setRefChat(refChat);
		System.out.println
		
	
		
		
		
		
		
		
	

	}

}
