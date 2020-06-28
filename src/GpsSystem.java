
public class GpsSystem {
	
	String location;
	long phoneNum;
	
	void getRoute() {
		
	}
	void findShortestLocation() {
		
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	GpsSystem(long phoneNum ){
		this.phoneNum=phoneNum;
	}

}
