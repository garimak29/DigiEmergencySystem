/*
 * 
 * only location from addressLocator will be stored here
 * 
 * 
 * */
public class Ambulance {

	String driverName;
	String driverId;
	String ambulanceId;
	AddressLocator ambulancelocation;
	AddressLocator incidentLocation;
	String status;
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public String getAmbulanceId() {
		return ambulanceId;
	}
	public void setAmbulanceId(String ambulanceId) {
		this.ambulanceId = ambulanceId;
	}
	public AddressLocator getAmbulancelocation() {
		return ambulancelocation;
	}
	public void setAmbulancelocation(AddressLocator ambulancelocation) {
		this.ambulancelocation = ambulancelocation;
	}
	public AddressLocator getIncidentLocation() {
		return incidentLocation;
	}
	public void setIncidentLocation(AddressLocator incidentLocation) {
		this.incidentLocation = incidentLocation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
