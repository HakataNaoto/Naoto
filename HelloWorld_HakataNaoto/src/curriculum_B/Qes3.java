package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes3 {

	public static void main(String[] args) {
		for (int i1 = 1; i1 <= 10; i1++) {
			System.out.println(i1);
		}

		for (int i2 = 2; i2 <= 20; i2 += 2) {
			System.out.println(i2);
		}

		for (int i3 = 10; i3 >= 1; i3--) {
			System.out.println(i3);
		}

		int sum = 0;
		for (int i4 = 1; i4 <= 100; i4++) {
			sum += i4;
		}
		System.out.println(sum);

		for (int i5 = 1; i5 <= 5; i5++) {
			for (int j = 0; j < 5 - i5; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i5; k++) {
				System.out.print("＊");
			}
			System.out.println();
		}

		int i6 = 1;
		while (i6 <= 10) {
			System.out.println(i6);
			i6++;
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
			sUm += i6;
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
			
			scanner.close();
		}
	}

}
