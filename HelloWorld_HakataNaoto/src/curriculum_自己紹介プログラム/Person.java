package curriculum_自己紹介プログラム;

public class Person {

	String name;
	int age;
	double height;
	double weight;

	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}


	double bmi() {
		return this.weight / (this.height * this.height);
	}

	
	void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.printf("BMIは%.2fです%n", this.bmi()); 
		
	}
}

