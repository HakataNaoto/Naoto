package curricuium_c;

import java.util.Scanner;

public class InputHandler {
	private Scanner scanner;

	public InputHandler() {
		this.scanner = new Scanner(System.in);
	}

	public int readChoice() {
		System.out.print("グー（0）、チョキ（1）、パー（2）を入力：");
		return scanner.nextInt();
	}

	public void close() {
		scanner.close();
	}
}
