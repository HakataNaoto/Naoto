package curriculum_自己紹介プログラム;

public class Main {

	public static void main(String[] args) {
		Person[] person1 = {
				new Person("鈴木太郎", 20, 1.7, 60.0)
		};

		for (Person p : person1) {
			p.print();
		}
		System.out.println("合計" + person1.length + "人です");
	}
}
