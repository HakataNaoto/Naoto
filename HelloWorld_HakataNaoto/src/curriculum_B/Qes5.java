package curriculum_B;

public class Qes5 {

	public static void helloWorld() {
		System.out.println("Hello,World!");
	}

	public static int doubleValue(int num) {
		return num * 2;
	}

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static void main(String[] args) {
		helloWorld();

		int num = 10;
		int result = doubleValue(num);
		System.out.println(num + "を2倍すると" + result + "です。");

		int num1 = 7;
		int num2 = 10;

		if (isEven(num2)) {
			System.out.println(num2+"は偶数です。");
		}
		if (!isEven(num1)) {
			System.out.println(num1+"は奇数です。");
		}
		Greeting.sayHello();
		Animal lion = new Animal();

		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80.0);

		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");

	}

}