
public class AddressLocator {

	String area;
	long pincode;
	String city;
	String country;
	String location;
	String address;
	public void setAddress() {
		address = area +" "+city+" "+pincode+" "+","+country;
	}
	public String getAddress() {
		return address;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLocation( String area, String pincode , String city , String country , Incident incident) {
		if ( area == null || pincode == null || city == null || country ==null )
		{
			location = (String) (new GpsSystem(incident.getPhoneNum()).getLocation());
		}
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
}
