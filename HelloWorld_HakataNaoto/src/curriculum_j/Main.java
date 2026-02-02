package curriculum_j;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Billable> employees = new ArrayList<>();


		employees.add(new FullTimeEmployee(1));
		employees.add(new FullTimeEmployee(2));
		employees.add(new ContractEmployee(3));
		employees.add(new ContractEmployee(4));

		System.out.println("=== 日給計算結果 (10時間労働) ===");
		for (Billable employee : employees) {
			Employee emp = (Employee) employee;
			int dailyCost = employee.costForDay(10);
			System.out.println(emp.getInfo() + " → " + dailyCost + "円");
		}
	}



}
