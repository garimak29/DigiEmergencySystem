
public class Incident extends Information{

	AddressLocator address;
	Ambulance[] ambulanceDetails;
	public AddressLocator getAddress() {
		return address;
	}

	public void setAddress(AddressLocator address) {
		this.address = address;
	}
	
}
