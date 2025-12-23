package curriculum_B;


public class Qes5 {

	public static void helloWorld() {
		System.out.println("Hello,World!");
	}

	public static void main(String[] args) {
		helloWorld();
	}

	public class Main {

		public static int doubleValue(int num) {
			return num * 2;
		}

		public static void main(String[] args) {
			int num = 10;
			int result = doubleValue(num);
			System.out.println(num + "を2倍すると" + result + "です。");
		}
	}

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	{
		int num1 = 7;
		int num2 = 10;

		if (isEven(num2)) {
			System.out.println("10は偶数です。");
		}
		if (!isEven(num1)) {
			System.out.println("7は奇数です。");
		}
	}

	public class Greeting {
		public static void sayHello() {
			System.out.println("こんにちは！");
		}
	}

	public class Main2 {
		public static void main(String[] args) {
			Greeting.sayHello();
		}
	}

	
	public class Animal {
		private String name;
		private double length;
		private double speed;
		
		public void setName(String name) {
			this.name = name;
		}

		
		public String getName() {
			return this.name;
		}

		
		public void setLength(double length) {
			this.length = length;
		}

		
		public double getLength() {
			return this.length;
		}

		
		public void setSpeed(double speed) {
			this.speed = speed;
		}

		
		public double getSpeed() {
			return this.speed;
		}
	
	
	public class Main3 {
		public static void main(String[] args) {
			{
			Animal lion = new Animal();
			
			lion.setName("ライオン");
			lion.setLength(2.1);
			lion.setSpeed(80.0);
			
			System.out.println("動物名：" + lion.getName());
			System.out.println("体長：" + lion.getLength() + "m");
			System.out.println("速度：" + lion.getSpeed() + "km/h");
			}
		}
	}
}