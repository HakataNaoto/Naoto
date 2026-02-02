package curriculum_h;


public class FullTimeEmployee extends Employee {
	private static final int HOURLY_RATE = 1200;

	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int calculateDailyWage(int hoursWorked) {
		int wage = 0;
		if (hoursWorked <= 8) {
			wage = hoursWorked * HOURLY_RATE;
		} else {
			wage = 8 * HOURLY_RATE + (hoursWorked - 8) * HOURLY_RATE * 125 / 100;
		}
		return wage;
	}



	public static void main(String[] args) {


	}

}
