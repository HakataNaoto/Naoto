package curriculum_j;


interface Billable {
	int costForDay(int hoursWorked);
}


abstract class Employee implements Billable {
	protected int id;

	public Employee(int id) {
		this.id = id;
	}

	public abstract int costForDay(int hoursWorked);

	public String getInfo() {
		return "ID: " + id;
	}
}


class FullTimeEmployee extends Employee {
	private static final int HOURLY_RATE = 1250;
	private static final int OVERTIME_RATE = 8;
	private static final double OVERTIME_MULTIPLIER = 1.25;

	public FullTimeEmployee(int id) {
		super(id);
	}


	public int costForDay(int hoursWorked) {
		if (hoursWorked <= OVERTIME_RATE) {
			return hoursWorked * HOURLY_RATE;
		} else {
			int regularPay = OVERTIME_RATE * HOURLY_RATE;
			int overtimeHours = hoursWorked - OVERTIME_RATE;
			int overtimePay = (int)(overtimeHours * HOURLY_RATE * OVERTIME_MULTIPLIER);
			return regularPay + overtimePay;
		}
	}
}


class ContractEmployee extends Employee {
	private static final int HOURLY_RATE = 1000;

	public ContractEmployee(int id) {
		super(id);
	}


	public int costForDay(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;
	}


}
