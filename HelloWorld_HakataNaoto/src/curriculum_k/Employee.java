package curriculum_k;


interface SalaryStrategy {
 long calculateSalary(int hours);
}


class FullTimeSalaryStrategy implements SalaryStrategy {
 public long calculateSalary(int hours) {
     return hours * 1200L;
 }
}


class ContractSalaryStrategy implements SalaryStrategy {
 @Override
 public long calculateSalary(int hours) {
     return hours * 1000L;
 }
}


class Employee {
 private final String employeeId;
 private final String name;
 private final int hours;
 private final SalaryStrategy strategy;

 public Employee(String employeeId, String name, int hours, SalaryStrategy strategy) {
     this.employeeId = employeeId;
     this.name = name;
     this.hours = hours;
     this.strategy = strategy;
 }

 public String getEmployeeId() {
     return employeeId;
 }

 public String getName() {
     return name;
 }

 public long getSalary() {
     return strategy.calculateSalary(hours);
 }
}


class SalaryReporter {
 public void report(Employee e) {
     System.out.println(e.getName() + " の給与は " + e.getSalary() + " 円です。");
 }
}
