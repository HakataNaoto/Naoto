package curriculum_i;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
      
        employees.add(new FullTimeEmployee("001", "社員A"));
        employees.add(new FullTimeEmployee("002", "社員B"));
        employees.add(new ContractEmployee("003", "契約C"));
        employees.add(new ContractEmployee("004", "契約D"));
        
        int hoursWorked = 9;
        
        
        for (Employee emp : employees) {
            System.out.println(emp.id + " " + emp.name + ": " + 
                             emp.calculateDailyWage(hoursWorked) + "円");
        }
    }

}
