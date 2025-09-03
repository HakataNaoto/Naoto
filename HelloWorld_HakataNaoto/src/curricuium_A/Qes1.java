package curricuium_A;

public class Qes1 {//Qes1

	public static void main(String[] args) {
		byte byteNum=0;
		byteNum=10;
		short shortNum=0;
		shortNum=100;
		int intNum=0;
		intNum=1000;
		long longNum=0;
		longNum=10000;
		System.out.println(byteNum+shortNum+intNum+longNum);
		
		System.out.println(byteNum+byteNum);
		
		char letter ='a';
		letter='a';
		String letters ="ハロー";
		letters="ハロー";
		boolean isBoolean=false;
		isBoolean=true;
		System.out.println("letter"+"letters"+isBoolean);
		
		long number=byteNum+byteNum+byteNum+shortNum+intNum+longNum;//各桁の合計をコンソールに出力
		long sum=0;
		long temp=number;
		while(temp>0) {sum+=temp%10;
		temp/=10;
		}
		System.out.println(sum);
		
		long num=0;//各桁の積をコンソールに出力
		long Temp=Math.abs(num);
		while(Temp>0) {num*=Temp%10;
		Temp/=10;
		}
		System.out.println(longNum*longNum*shortNum);
		
		double doubleNum=0.0;
		doubleNum=10.5;
		System.out.println(doubleNum/shortNum);
		
		System.out.println(byteNum-shortNum);
		
		String name="山田太郎";
		name="山田太郎";
		System.out.println("こんにちは、"+name+"さん！");
		
		int age=0;
		age=25;
		System.out.println("年齢："+age+"歳");
		
		int num1=0;
		int num2=0;
		num1=10;
		num2=5;
		int Sum=num1+num2;
		System.out.println(Sum);
		
		int score=0;
		score=80;
		int extrascore=0;
		extrascore=20;
		int finalscore=score+extrascore;
		System.out.println("最終スコア:"+finalscore);
		
		double price=99.99;
		int priceInt=(int)price; //小数点以下切り捨て
		System.out.println("整数価格:"+priceInt);
		
		String numStr="123";//文字列
		int numStrInt=Integer.parseInt(numStr);//intに変換
		System.out.println("結果:"+numStrInt);//出力:結果:133
		
		int Num=50;//intをStringに変換
		String Str=Integer.toString(Num);//Stringに変換
		System.out.println("得点:"+Str+"点");//出力:得点:50点
		
		int a=10;
		int b=20;//aがbより小さいかどうか比較
		boolean result=a<b;//結果を出力
		System.out.println("a<bの結果"+result);
		
		int X=15;
		String results=(X>10)? "OK":"NG";
		System.out.println(results);
		
		String text="私はJavaが好きです。Javaは楽しい！";
		String Result=text.replace("Java","Python");
		System.out.println(Result);		

	}

}

