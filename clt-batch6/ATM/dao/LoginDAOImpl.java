package dao;

import pojo.User; 

public class LoginDAOImpl implements LoginDAO {

		boolean status;
		
		// connect with the DB here...

		@Override
		public boolean LoginValidate(User ref) {
			//connect with the DB here
				
				if(ref.getUserID()==1234 && ref.getUserPassword().equals("test")) {
					status = true;
				}
				else{
					status = false;
				}
		
			return status;
		
		}	

}
