import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class DispatcherService  {
	private List<Dispatcher> dispatcher =  new ArrayList<>(Arrays.asList(new Dispatcher("garima",18),
			new Dispatcher ("ba",8),
			new Dispatcher ("bat",9)
			));
	
	
	void assignDispatcherToIncident() {
		
	}
	Dispatcher getAvailableDispatcher() {
		for(int i=0;i<dispatcher.size();i++) {
			if (dispatcher.get(i).available == true)
			return dispatcher.get(i);
		}
		return null;
	}
	Ambulance getNearestAmbulance(AddressLocator address) {
		return new Ambulance() ;
	}
		
	void getIncidentDetails() {
		
	}
	Incident createIncident() {
		return new Incident();
	}
void getAmbulanceDetails() {
		
	}

void assignAmbulance() {
	// assign ambulance based on the number of personnels
	// divert the request if no ambulance is available in 11 mins
}
void findAmbulance() {
	Ambulance ambulance;
	
}
void findHospital() {
	// find nearest hospital 
	// check if it can accomodate the number of patients
}
void sendNotification() {
	
}
void displayRouteDetails() {
	
}
void trackAmbulance() {
	
}
void getJobStatus() {
	
}

}
