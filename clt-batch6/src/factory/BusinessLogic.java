package factory;

public class BusinessLogic {

	public static Bank myFactoryMethod(String reference) {
		
		if(reference.equals("dbs")) {
			return new DBSBank();
		}else if(reference.endsWith("citi")){
			return new CitiBank();
		}
	
		else
			return new OtherBank();
	
	} // end of myFactoryMethod
	

} // end of BusinessLogic
