
public class Supervisor extends User {

	public Supervisor(String name, int age) {
		setName(name);
		setAge(age);
		setDesignation("Supervisor");
	}

	public String generateReport() {
		return "";
	}
}
