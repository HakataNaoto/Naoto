package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("＊");
			}
			System.out.println();
		}

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		int num = 2;
		while (num <= 20) {
			System.out.println(num);
			num += 2;
		}

		int count = 10;
		while (count >= 1) {
			System.out.println(count);
			count--;
		}

		int sUm = 0;
		int nUm = 1;

		while (nUm <= 100) {
			sUm += i;
			nUm++;
		}

		System.out.println(sUm);

		Scanner scanner = new Scanner(System.in);
		int input;

		System.out.println("数値を入力してください（0で終了）");

		while (true) {
			input = scanner.nextInt();
			if (input == 0) {
				System.out.println("終了しました");
				break;
			}

			scanner.close();
		}

		String[] products = { "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", "テレビ", "ディスプレイ", "スマホ" };
		Random rand = new Random();

		int tvStock = rand.nextInt(12);
		int displayStock = 11 - tvStock;
		for (String product : products) {
			int remaining = 0;
			switch (product) {
			case "テレビ":
				remaining = tvStock;
				break;
			case "ディスプレイ":
				remaining = displayStock;
				break;
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				remaining = rand.nextInt(12);
				break;
			default:
				System.out.println(product + "は指定の商品ではありません");
				continue;
			}
			String output = product + "の残り台数は " + remaining + "台です";
			System.out.println(output);
		}
	}

}
