package curriculum_k;

public class Main {
	public static void main(String[] args) {
		SalaryReporter reporter = new SalaryReporter();

		Employee fullTime = new Employee("001", 160, new FullTimeSalaryStrategy());
		reporter.report(fullTime);  

		Employee contract = new Employee("002", 160, new ContractSalaryStrategy());
		reporter.report(contract);  
	}



}
