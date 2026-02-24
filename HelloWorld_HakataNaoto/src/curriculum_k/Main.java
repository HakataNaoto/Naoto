package curriculum_k;

public class Main {
	public static void main(String[] args) {
		SalaryReporter reporter = new SalaryReporter();

		Employee fullTime = new Employee("001", "田中太郎", 160, new FullTimeSalaryStrategy());
		reporter.report(fullTime);

		Employee contract = new Employee("002", "鈴木花子", 160, new ContractSalaryStrategy());
		reporter.report(contract);

	}
}
