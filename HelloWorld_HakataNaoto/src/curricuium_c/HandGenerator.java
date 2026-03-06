package curricuium_c;

import java.util.Random;

public class HandGenerator {
	private Random random;

	public HandGenerator() {
		this.random = new Random();
	}

	public String generate() {
		int choice = random.nextInt(3);
		switch (choice) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
		default:
			return "グー";
		}
	}
}
