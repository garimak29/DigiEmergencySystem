
public class DigiEmergencySystem {
	
	
	
	
	
	
	
	ManageUser manageUser;
	DispatcherService dispatcher = null;;
		
/*	DispatcherService assignDispatcherToIncident() {
		User dispatcher = manageUser.getUser("Dispatcher");
		return (DispatcherService) dispatcher;
	}
	*/
	void logIncident() {
		dispatcher.assignDispatcherToIncident();
		
		dispatcher.createIncident();
		
	}
	private DispatcherService assignDispatcherToIncident() {
		// TODO Auto-generated method stub
		return null;
	}
	void main() {
		
		System.out.println("1. log incident , 2. generate Report 3. track ambulance");
		
		// if 1
		logIncident();
	}
	
	
	
	
}
