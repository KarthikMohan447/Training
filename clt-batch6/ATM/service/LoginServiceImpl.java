package service;

import dao.LoginDAO;
import dao.LoginDAOImpl;
import pojo.User;

public class LoginServiceImpl implements LoginService {
	
	LoginDAO refLoginDAO;
	

	@Override
	public void checkStatus(User ref) {
		refLoginDAO = new LoginDAOImpl();
    	if(refLoginDAO.LoginValidate(ref)==true){
    		System.out.println("Welcome");
    	}
    	else
    	{
    	System.out.println("Not valid");	
    		
    	}
	
	}
}
	
