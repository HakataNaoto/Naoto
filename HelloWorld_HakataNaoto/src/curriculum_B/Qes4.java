package curriculum_B;

import java.util.Scanner;

public class Qes4 {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		int[] numbers2 = { 10, 20, 30, 40, 50 };

		for (int i = numbers2.length - 1; i >= 0; i--) {
			System.out.println(numbers2[i]);
		}

		int[] numbers3 = { 3, 5, 7, 9, 11 };

		int sum = 0; 

		for (int i = 0; i < numbers3.length; i++) {
			sum += numbers3[i];
		}
		System.out.println(sum);

		int[] numbers4 = { 12, 7, 9, 21, 5, 18 };

		int max = numbers4[0];
		int min = numbers4[0];

		for (int i = 1; i < numbers4.length; i++) {
			if (numbers4[i] > max) {
				max = numbers4[i];
			}
			if (numbers4[i] < min) {
				min = numbers4[i];
			}
		}

		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);

		int[] array = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 2;
		}

		for (int num : array) {
			System.out.println(num);
		}

		int[] numbers5 = { 4, 7, 10, 15, 20 };
		Scanner scanner = new Scanner(System.in);

		System.out.print("結果: ");
		int input = scanner.nextInt();

		boolean found = false;
		for (int num : numbers5) {
			if (num == input) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(input + "は配列に含まれています");
		} else {
			System.out.println(input + "は配列に含まれていません");

			int[][] Array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

			for (int i = 0; i < Array.length; i++) {
				for (int j = 0; j < Array[i].length; j++) {
					System.out.print(Array[i][j] + " ");
				}
				System.out.println(Array);
			}

			int[][] Array2 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
			int Sum = 0;

			for (int i = 0; i < Array2.length; i++) {
				for (int j = 0; j < Array2[i].length; j++) {
					Sum += Array2[i][j];
				}
			}
			System.out.println("配列のすべての要素の合計値: " + Sum);

			int[][] Array3 = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };
			int Max = Array3[0][0];
			int Min = Array3[0][0];

			for (int i = 0; i < Array3.length; i++) {
				for (int j = 0; j < Array3[i].length; j++) {
					if (Array3[i][j] > Max) {
						Max = Array3[i][j];
					}
					if (Array3[i][j] < Min) {
						Min = Array3[i][j];
					}
				}
			}

			System.out.println("最大値: " + Max);
			System.out.println("最小値: " + Min);
		}

		int[][][] Array4 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		for (int i = 0; i < Array4.length; i++) {
			for (int j = 0; j < Array4[i].length; j++) {
				for (int k = 0; k < Array4[i][j].length; k++) {
					System.out.println("Array4[" + i + "][" + j + "][" + k + "] = " + Array4[i][j][k]);
				}
			}
		}

		scanner.close();
	}
}
