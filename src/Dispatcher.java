
public class Dispatcher extends User {

	boolean available;
	public Dispatcher(String name, int age ) {
		setName(name);
		setAge(age);
		setDesignation("Dispatcher");
		setAvaiable(true);
		// TODO Auto-generated constructor stub
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvaiable(boolean available) {
		this.available = available;
	}
}
