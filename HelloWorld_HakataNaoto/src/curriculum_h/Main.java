package curriculum_h;

public class Main {
	public static void main(String[] args) {
		FullTimeEmployee fullTime = new FullTimeEmployee("001", "");
		PartTimeEmployee partTime = new PartTimeEmployee("002", "");

		int fullTimeWage = fullTime.calculateDailyWage(9);
		int partTimeWage = partTime.calculateDailyWage(9);

		System.out.println("正社員の給与：" + fullTimeWage + "円");
		System.out.println("パート社員の給与：" + partTimeWage + "円");
	}


}


