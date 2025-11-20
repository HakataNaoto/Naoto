package curriculum_B;

import java.util.Scanner;

public class Qes4 {

	public static void main(String[] args) {		

		int[] numbers = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		int[] nUmbers = { 10, 20, 30, 40, 50 };

		for (int i = nUmbers.length - 1; i >= 0; i--) {
			System.out.println(nUmbers[i]);
		}

		int[] nuMbers = { 3, 5, 7, 9, 11 };

		int sum = 0;

		for (int i = 0; i < nuMbers.length; i++) {
			sum += nuMbers[i];
		}
		System.out.println(sum);

		int[] numBers = { 12, 7, 9, 21, 5, 18 };

		int max = numBers[0];
		int min = numBers[0];

		for (int i = 1; i < numBers.length; i++) {
			if (numBers[i] > max) {
				max = numBers[i];
			}
			if (numBers[i] < min) {
				min = numBers[i];
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

		int[] numbErs = { 4, 7, 10, 15, 20 };
		Scanner scanner = new Scanner(System.in);

		System.out.print("結果: ");
		int input = scanner.nextInt();

		boolean found = false;
		for (int num : numbErs) {
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
		
		int[][] ARray = { {10, 20, 30}, {40, 50, 60}, {70, 80, 90} };
		int Sum = 0;

		for (int i = 0; i < ARray.length; i++) {
			for (int j = 0; j < ARray[i].length; j++) {
				Sum += ARray[i][j];
			}
		}
		System.out.println("配列のすべての要素の合計値: " + Sum);

		int[][] ARRay = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };
		int Max = ARRay[0][0];
		int Min = ARRay[0][0];

		for (int i = 0; i < ARRay.length; i++) {
			for (int j = 0; j < ARRay[i].length; j++) {
				if (ARRay[i][j] > Max) {
					Max = ARRay[i][j];
				}
				if (ARRay[i][j] < Min) {
					Min = ARRay[i][j];
				}
			}
		}

		System.out.println("最大値: " + Max);
		System.out.println("最小値: " + Min);

		
		int[][][] ARRAy = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		for (int i = 0; i < ARRAy.length; i++) {
			for (int j = 0; j < ARRAy[i].length; j++) {
				for (int k = 0; k < ARRAy[i][j].length; k++) {
					System.out.println("ARRAy[" + i + "][" + j + "][" + k + "] = " + ARRAy[i][j][k]);
				}
			}
		}
		}
		scanner.close();

    	

}

}
		
		
		
		
	


		                
		                
		                
		                
		                
		           
		        

		        
		        
		        
		        
		        
		        
		    
		



