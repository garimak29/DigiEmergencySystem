/* factory pattern would be implemented here where when we try to add a new user 
 * it would check the type of object and then add the a new obj of dispatcher/ambulanc/Supervisor
 * 
 * here composite pattern can also be implemented based on the operations where 
 * dispatcher and ambulance will be leaf classes and supervisor will be composite class
 * 
 * */
public class ManageUser extends User  {

	
	
	//foctory pattern
	public User addUsers(String name , int age , String designation) {
		
		if (designation == "Dispatcher")
			return new Dispatcher(name, age);
		else if (designation == "AmbulancePersonnel")
			return new AmbulancePersonnel(name, age);
		else if( designation == "Supervisor")
			return new Supervisor(name, age);
		return null; 
	}
	public void updateUsers() {
		
	}
	public void deleteUsers() {
		
	}

	
	

	public User getUser(String designation) {
		// based on designation and current avaiability of the user , user will be assigned for the purpose
		return null ;
	}
	public String validateUser( String username , String password)
	{
		return "";
	}
	
	
}
