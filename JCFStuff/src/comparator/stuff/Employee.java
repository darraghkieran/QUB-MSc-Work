package comparator.stuff;

public class Employee {
	private String name;
	private int age;
	private String employStatus;

	public Employee() {

	}

	public Employee(String name, int age, String employStatus) {
		this.name = name;
		this.age = age;
		this.employStatus = employStatus;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the employStatus
	 */
	public String getEmployStatus() {
		return employStatus;
	}

	/**
	 * @param employStatus the employStatus to set
	 */
	public void setEmployStatus(String employStatus) {
		this.employStatus = employStatus;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", employStatus=" + employStatus + "]";
	}
}