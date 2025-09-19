package curricuium_A;

public class Qes1 {//Qes1

	public static void main(String[] args) {
		// Q1
		byte byteNum = 0;
		short shortNum = 0;
		int intNum = 0;
		long longNum = 0L;
		float floatNum = 0.0f;
		double doubleNum = 0.0;
		char letter = '\u0000';
		String letters = null;
		boolean isBoolean = false;

		// Q2
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum =9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		// Q3
		System.out.println(byteNum + shortNum + intNum + longNum);

		System.out.println(byteNum + byteNum);

		System.out.println(letter + letters + isBoolean);

		System.out.println(byteNum + shortNum + intNum + longNum + floatNum + doubleNum);

		System.out.println(byteNum * intNum * longNum * shortNum);

		System.out.println(doubleNum / shortNum);

		System.out.println(byteNum - shortNum);

		// Q4
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！");

		// Q5
		int age = 0;
		age = 25;
		System.out.println("年齢：" + age + "歳");

		// Q6
		int num1 = 0;
		int num2 = 0;
		num1 = 10;
		num2 = 5;
		int Sum = num1 + num2;
		System.out.println(Sum);

		// Q7
		int score = 0;
		score = 80;
		int extrascore = 0;
		extrascore = 20;
		int finalscore = score + extrascore;
		System.out.println("最終スコア:" + finalscore);

		// Q8
		double price = 99.99;
		int priceInt = (int) price; //小数点以下切り捨て
		System.out.println("整数価格:" + priceInt);

		// Q9
		String numStr = "123";//文字列
		int numStrInt = Integer.parseInt(numStr);//intに変換
		System.out.println(numStrInt + 10);//出力:結果:133

		// Q10
		int Num = 50;//intをStringに変換
		String Str = Integer.toString(Num);//Stringに変換
		System.out.println("得点:" + Str + "点");//出力:得点:50点

		// Q11
		int a = 10;
		int b = 20;//aがbより小さいかどうか比較
		boolean result = a < b;//結果を出力
		System.out.println("a<bの結果" + result);

		// Q12
		int X = 15;
		String results = (X > 10) ? "OK" : "NG";
		System.out.println(results);

		// Q13
		String text = "私はJavaが好きです。Javaは楽しい！";
		String Result = text.replace("Java", "Python");
		System.out.println(Result);

	}

}
