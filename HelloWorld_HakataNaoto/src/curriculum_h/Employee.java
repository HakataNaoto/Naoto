package curriculum_h;


public abstract class Employee {
	protected String employeeId;
	protected String name;

	public Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public abstract int calculateDailyWage(int hoursWorked);


public static void main(String[] args) {


}

}
